package com.kibong.refactoring_study.primitive_obsession._30_repliace_primitive_with_object;

import java.util.List;

public class Priority {

    private String value;
    private List<String> priorityList = List.of("low", "normal", "high", "rush");

    public Priority(String value) {
        if (!priorityList.contains(value)) {
            throw new IllegalArgumentException("존재하지 않는 value 입니다.");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public int index() {
        return priorityList.indexOf(this.value);
    }

    public boolean higherThan(Priority priority) {
        return this.index() > priority.index();
    }
}
