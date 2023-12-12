package com.vaultstarter.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.vault.annotation.VaultPropertySource;

@Configuration
@VaultPropertySource(value = "secret/app-config", ignoreSecretNotFound = false)
public class AppConfig {

    @Value("${app.name}")
    private String appName;

    public String getAppName() {
        return appName;
    }

}
