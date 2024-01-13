package com.kibong.refactoring_study.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class Chief {

    private String chiefName;
    private List<Food> foodList;

    @Builder
    public Chief(String chiefName, List<Food> foodList) {
        this.chiefName = chiefName;
        this.foodList = foodList;
    }
}
