package com.chassot.study.devops.spring.service;

import com.chassot.study.devops.spring.controller.response.RetrieveTestResponse;

public interface TestService {

    RetrieveTestResponse retrieve(Long id);

}
