package com.assistent.admin.infrastructure.services;

import com.assistent.admin.domain.resource.Resource;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface StorageService {

    void store(String name, Resource resource);

    Optional<Resource> get(String name);

    List<String> list(String prefix);

    void deleteAll(final Collection<String> names);
}
