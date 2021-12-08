package com.chassot.study.devops.spring;

import com.chassot.study.devops.spring.controller.TestController;
import com.chassot.study.devops.spring.service.TestService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Unit Test: Test Controller")
@ExtendWith(MockitoExtension.class)
class TestControllerTest {

    @InjectMocks
    private TestController testController;

    @Mock
    private TestService testService;

    @BeforeEach
    void initEach() {

    }

    @DisplayName("Unit Test: Retrieve tests")
    @Nested
    class RetrieveTest {

        @DisplayName("Unit Test: Success - retrieve - Successfully retrieved test information")
        @Test
        void retrieve_shouldReturnJson() {
            assertTrue(true);
        }

    }

}
