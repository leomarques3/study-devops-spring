package com.chassot.study.devops.spring.controller;

import com.chassot.devops.integration.enums.RelationshipEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SaveTestRequest {

    private RelationshipEnum relationship;

}
