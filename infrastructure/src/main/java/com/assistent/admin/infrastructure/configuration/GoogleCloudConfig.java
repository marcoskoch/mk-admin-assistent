package com.assistent.admin.infrastructure.configuration;

import com.assistent.admin.infrastructure.configuration.properties.google.GoogleCloudProperties;
import com.assistent.admin.infrastructure.configuration.properties.google.GoogleStorageProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"development", "production"})
public class GoogleCloudConfig {

    @Bean
    @ConfigurationProperties("google.cloud")
    public GoogleCloudProperties googleCloudProperties() {
        return new GoogleCloudProperties();
    }

    @Bean
    @ConfigurationProperties("google.cloud.storage.catalogo-videos")
    public GoogleStorageProperties googleStorageProperties() {
        return new GoogleStorageProperties();
    }
}
