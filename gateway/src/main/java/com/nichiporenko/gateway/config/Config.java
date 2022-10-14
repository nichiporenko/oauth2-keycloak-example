package com.nichiporenko.gateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class Config {

    @Autowired
    private Environment environment;

    @Autowired
    private ServerProperties serverProperties;

}
