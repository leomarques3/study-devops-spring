package com.chassot.study.devops.spring.controller;

import com.chassot.study.devops.spring.controller.response.RetrieveTestResponse;
import com.chassot.study.devops.spring.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/tests")
public class TestController {

    private final TestService testService;

    @GetMapping("/{id}")
    public ResponseEntity<RetrieveTestResponse> retrieve(@PathVariable Long id) {
        log.info("Retrieving test information: new test");
        log.debug("Received id: {}", id);
        RetrieveTestResponse retrieveTestResponse = testService.retrieve(id);
        log.debug("Retrieved information: {}", retrieveTestResponse);
        return ResponseEntity.ok(retrieveTestResponse);
    }

    @PostMapping
    public ResponseEntity<RetrieveTestResponse> save(@Validated @RequestBody SaveTestRequest saveTestRequest) {
        log.info("Saving test infomation");
        return ResponseEntity.ok().build();
    }

}
