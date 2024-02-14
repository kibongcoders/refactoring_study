package com.kibong.refactoring_study.data_class.encapsulate_record;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
public class OrganizationTest {

    @Test
    void name(){
        Organization organization = new Organization("kibong", "korea");

        assertEquals("hello", organization.name(), "kibong");

    }

}
