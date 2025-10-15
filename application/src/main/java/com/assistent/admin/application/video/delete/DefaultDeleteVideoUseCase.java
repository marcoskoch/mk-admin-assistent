package com.assistent.admin.application.video.delete;

import com.assistent.admin.domain.video.VideoGateway;
import com.assistent.admin.domain.video.VideoID;

import java.util.Objects;

public class DefaultDeleteVideoUseCase extends DeleteVideoUseCase {

    private final VideoGateway videoGateway;

    public DefaultDeleteVideoUseCase(final VideoGateway videoGateway) {
        this.videoGateway = Objects.requireNonNull(videoGateway);
    }

    @Override
    public void execute(String anIn) {
        this.videoGateway.deleteById(VideoID.from(anIn));
    }
}
