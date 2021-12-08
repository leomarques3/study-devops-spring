package com.chassot.study.devops.spring.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum RelationshipEnum {

    CARDHOLDER(0),
    SPOUSE(1),
    CHILD_UNDERAGE(2),
    CHILD_OVERAGE(3),
    DISABLE_DEPENDENT(4),
    DEPENDANT_STUDENT(5),
    NOT_KNOWN(9);

    private final Integer value;

    @JsonValue
    public Integer getValue() {
        return this.value;
    }

    @JsonCreator
    public static RelationshipEnum fromInteger(Integer value) {
        for (RelationshipEnum fromEnum : RelationshipEnum.values()) {
            if (fromEnum.value.equals(value)) {
                return fromEnum;
            }
        }
        return null;
    }

}
