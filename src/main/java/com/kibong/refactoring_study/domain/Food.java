package com.kibong.refactoring_study.domain;

import lombok.Builder;
import lombok.Data;

@Data
public class Food {

    private String foodName;
    private String foodType;
    private Integer foodCost;

    @Builder
    public Food(String foodName, String foodType, Integer foodCost) {
        this.foodName = foodName;
        this.foodType = foodType;
        this.foodCost = foodCost;
    }
}
