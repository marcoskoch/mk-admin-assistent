package com.assistent.admin.infrastructure.services.local;

import com.assistent.admin.domain.resource.Resource;
import com.assistent.admin.infrastructure.services.StorageService;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryStorageService implements StorageService {

    private final Map<String, Resource> storage;

    public InMemoryStorageService() {
        this.storage = new ConcurrentHashMap<>();
    }

    public void reset() {
        this.storage.clear();
    }

    public Map<String, Resource> storage() {
        return this.storage;
    }

    @Override
    public void store(final String name, final Resource resource) {
        this.storage.put(name, resource);
    }

    @Override
    public Optional<Resource> get(final String name) {
        return Optional.ofNullable(this.storage.get(name));
    }

    @Override
    public List<String> list(final String prefix) {

        if (prefix == null) {
            return Collections.emptyList();
        }

        return this.storage.keySet().stream()
                .filter(name -> name.startsWith(prefix))
                .toList();
    }

    @Override
    public void deleteAll(final Collection<String> names) {
        names.forEach(this.storage::remove);
    }
}
