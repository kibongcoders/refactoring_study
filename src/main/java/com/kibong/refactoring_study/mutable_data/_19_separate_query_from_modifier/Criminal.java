package com.kibong.refactoring_study.mutable_data._19_separate_query_from_modifier;

import java.util.List;

public class Criminal {
    //1. 메서드를 복사한다.
    //2. 조회와 질의를 분리한다.

    public void alertForMiscreant(List<Person> people) {
        if (!findForMiscreant(people).isBlank())
            setOffAlarms();
    }

    public String findForMiscreant(List<Person> people) {
        for (Person p : people) {
            if (p.getName().equals("Don")) {
                return "Don";
            }

            if (p.getName().equals("John")) {
                return "John";
            }
        }

        return "";
    }

    private void setOffAlarms() {
        System.out.println("set off alarm");
    }
}
