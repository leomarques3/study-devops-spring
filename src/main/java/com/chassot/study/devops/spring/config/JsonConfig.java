package com.chassot.study.devops.spring.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JsonConfig {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Bean
    public ObjectMapper objectMapper() {
        objectMapper.findAndRegisterModules();
        return objectMapper;
    }

}
