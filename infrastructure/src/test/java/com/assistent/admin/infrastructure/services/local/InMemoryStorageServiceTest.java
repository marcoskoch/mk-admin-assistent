package com.assistent.admin.infrastructure.services.local;

import com.assistent.admin.domain.Fixture;
import com.assistent.admin.domain.utils.IdUtils;
import com.assistent.admin.domain.video.VideoMediaType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class InMemoryStorageServiceTest {

    private InMemoryStorageService target = new InMemoryStorageService();

    @BeforeEach
    public void setUp() {
        this.target.reset();
    }

    @Test
    public void givenValidResource_whenCallsStore_shouldStoreIt() {
        final var expectedResource = Fixture.Videos.resource(VideoMediaType.VIDEO);
        final var expectedName = IdUtils.uuid();

        target.store(expectedName, expectedResource);

        final var actualContent = this.target.storage().get(expectedName);

        Assertions.assertEquals(expectedResource, actualContent);
    }

    @Test
    public void givenValidResource_whenCallsGet_shouldRetrieveIt() {
        final var expectedResource = Fixture.Videos.resource(VideoMediaType.VIDEO);
        final var expectedName = IdUtils.uuid();

        this.target.storage().put(expectedName, expectedResource);

        final var actualContent = target.get(expectedName).get();

        Assertions.assertEquals(expectedResource, actualContent);
    }

    @Test
    public void givenInvalidResource_whenCallsGet_shouldBeEmpty() {
        final var expectedName = IdUtils.uuid();

        final var actualContent = target.get(expectedName);

        Assertions.assertTrue(actualContent.isEmpty());
    }

    @Test
    public void givenValidPrefix_whenCallsList_shouldRetrieveAll() {
        final var expectedNames = List.of(
                "video_" + IdUtils.uuid(),
                "video_" + IdUtils.uuid(),
                "video_" + IdUtils.uuid()
        );

        final var all = new ArrayList<>(expectedNames);
        all.add("image_" + IdUtils.uuid());
        all.add("image_" + IdUtils.uuid());

        all.forEach( name -> target.storage().put(name, Fixture.Videos.resource(VideoMediaType.VIDEO)));

        Assertions.assertEquals(5, target.storage().size());

        final var actualContent = target.list("video");

        Assertions.assertEquals(expectedNames, actualContent);
    }

    @Test
    public void givenValidNames_whenCallsDelete_shouldDeleteAll() {
        final var videos = List.of(
                "video_" + IdUtils.uuid(),
                "video_" + IdUtils.uuid(),
                "video_" + IdUtils.uuid()
        );

        final var expectedNames = Set.of(
                "image_" + IdUtils.uuid(),
                "image_" + IdUtils.uuid()
        );

        final var all = new ArrayList<>(videos);
        all.addAll(expectedNames);

        all.forEach( name -> target.storage().put(name, Fixture.Videos.resource(VideoMediaType.VIDEO)));

        Assertions.assertEquals(5, target.storage().size());

        target.deleteAll(videos);

        Assertions.assertEquals(2, target.storage().size());
        Assertions.assertEquals(expectedNames, target.storage().keySet());
    }
}
