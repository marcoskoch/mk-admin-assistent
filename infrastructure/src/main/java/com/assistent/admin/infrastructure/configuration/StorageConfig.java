package com.assistent.admin.infrastructure.configuration;

import com.assistent.admin.infrastructure.configuration.properties.google.GoogleStorageProperties;
import com.assistent.admin.infrastructure.services.StorageService;
import com.assistent.admin.infrastructure.services.impl.GCStorageService;
import com.assistent.admin.infrastructure.services.local.InMemoryStorageService;
import com.google.cloud.storage.Storage;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class StorageConfig {

    @Bean(name = "StorageService")
    @Profile({"production", "development"})
    public StorageService gcStorageService(
            final GoogleStorageProperties props,
            final Storage storage
            ) {
        return new GCStorageService(
                props.getBucket(),
                storage
        );
    }

    @Bean(name = "StorageService")
    @ConditionalOnMissingBean
    public StorageService inMemoryStorageService() {
        return new InMemoryStorageService();
    }}
