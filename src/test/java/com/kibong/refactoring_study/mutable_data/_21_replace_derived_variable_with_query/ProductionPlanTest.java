package com.kibong.refactoring_study.mutable_data._21_replace_derived_variable_with_query;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductionPlanTest {

    @Test
    void production() {
        ProductionPlan productionPlan = new ProductionPlan();
        productionPlan.applyAdjustment(10);
        productionPlan.applyAdjustment(20);
        assertEquals(30, productionPlan.getProduction());
    }

}