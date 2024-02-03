package com.kibong.refactoring_study.primitive_obsession._30_repliace_primitive_with_object;

import java.util.List;

public class OrderProcessor {

    public long numberOfHighPriorityOrders(List<Order> orders) {
        return orders.stream()
                .filter(o -> o.getPriority() == "high" || o.getPriority() == "rush")
                .count();
    }
}
