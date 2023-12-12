package com.vaultstarter.controller;

import com.vaultstarter.configuration.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    private AppConfig appConfig;

    @GetMapping("/config")
    public String getConfig() {
        return appConfig.getAppName();
    }

}
