package com.assistent.admin.infrastructure.services.impl;

import com.assistent.admin.domain.resource.Resource;
import com.assistent.admin.infrastructure.services.StorageService;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.BlobId;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

public class GCStorageService implements StorageService {

    private final String bucket;
    private final Storage storage;

    public GCStorageService(final String bucket, final Storage storage) {
        this.bucket = bucket;
        this.storage = storage;
    }

    @Override
    public void store(String name, Resource resource) {
        final var blobInfo = BlobInfo.newBuilder(this.bucket, name)
                .setContentType(resource.contentType())
                .setCrc32cFromHexString(resource.checksum())
                .build();

        this.storage.create(blobInfo, resource.content());
    }

    @Override
    public Optional<Resource> get(final String name) {
        return Optional.ofNullable(this.storage.get(this.bucket, name))
                .map(blob -> Resource.with(
                        blob.getCrc32c(),
                        blob.getContent(),
                        blob.getContentType(),
                        name
                ));
    }

    @Override
    public List<String> list(String prefix) {
        final var blobs = this.storage.list(bucket, Storage.BlobListOption.prefix(prefix));

        return StreamSupport.stream(blobs.iterateAll().spliterator(), false)
                .map(BlobInfo::getBlobId)
                .map(BlobId::getName)
                .toList();
    }

    @Override
    public void deleteAll(final Collection<String> names) {
        final var blobs = names.stream()
                .map(name -> BlobId.of(this.bucket, name))
                .toList();

        this.storage.delete(blobs);
    }
}
