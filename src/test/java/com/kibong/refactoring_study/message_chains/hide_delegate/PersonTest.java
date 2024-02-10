package com.kibong.refactoring_study.message_chains.hide_delegate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void manager() {
        Person keesun = new Person("keesun");
        Person nick = new Person("nick");
        keesun.setDepartment(new Department("m365deploy", nick));

        Person manager = getManager(keesun);
        assertEquals(nick, manager);
    }

    private static Person getManager(Person keesun) {
        return keesun.getDepartment().getManager();
    }

}