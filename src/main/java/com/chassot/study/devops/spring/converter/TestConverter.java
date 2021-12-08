package com.chassot.study.devops.spring.converter;

import com.chassot.study.devops.spring.controller.response.RetrieveTestResponse;
import lombok.experimental.UtilityClass;

import java.time.LocalDateTime;

@UtilityClass
public class TestConverter {

    public RetrieveTestResponse convertFrom(Long id) {
        return RetrieveTestResponse.builder()
                .id(id)
                .retrievedAt(LocalDateTime.now())
                .build();
    }

}
