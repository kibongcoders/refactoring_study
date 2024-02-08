package com.kibong.refactoring_study.lazy_element.collapse_hierarchy;

import java.time.LocalDateTime;
import java.util.List;

public class Reservation {

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;

    private List<String> members;

    private String owner;

    private boolean paid;

    private String courtNumber;
}
