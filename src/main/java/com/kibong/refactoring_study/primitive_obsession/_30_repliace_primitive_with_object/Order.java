package com.kibong.refactoring_study.primitive_obsession._30_repliace_primitive_with_object;

public class Order {
    private Priority priority;

    public Order(Priority priority) {
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }
}
