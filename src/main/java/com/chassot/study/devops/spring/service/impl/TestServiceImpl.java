package com.chassot.study.devops.spring.service.impl;

import com.chassot.study.devops.spring.controller.response.RetrieveTestResponse;
import com.chassot.study.devops.spring.converter.TestConverter;
import com.chassot.study.devops.spring.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    @Value("${custom.valueTest}")
    private String testValue;

    @Value("${custom.valueDebug}")
    private String testDebug;

    @Value("${custom.database.password}")
    private byte[] password;

    @Override
    public RetrieveTestResponse retrieve (Long id) {
        log.info("Retrieving test information");
        log.debug("Received id: {}", id);
        log.info(testValue);
        log.debug(testDebug);
        log.debug(Arrays.toString(password));
        log.debug(Arrays.toString(Base64.getDecoder().decode(password)));
        String passwordDecoded = new String(Base64.getDecoder().decode(password), StandardCharsets.UTF_8).trim();
        log.debug("password: {}", passwordDecoded);
        return TestConverter.convertFrom(id);
    }

}
