package com.kibong.refactoring_study.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class Restaurant {

    private String restaurantName;
    private String restaurantType;
    private String restaurantRegion;
    private List<Chief> chiefList;

    @Builder
    public Restaurant(String restaurantName, String restaurantType, String restaurantRegion, List<Chief> chiefList) {
        this.restaurantName = restaurantName;
        this.restaurantType = restaurantType;
        this.restaurantRegion = restaurantRegion;
        this.chiefList = chiefList;
    }
}
