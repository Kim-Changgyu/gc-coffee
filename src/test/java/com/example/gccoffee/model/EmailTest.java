package com.example.gccoffee.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {
    @Test
    public void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            var email = new Email("abcdefg");
        });
    }

    @Test
    public void testValidEmail() {
        var email = new Email("abcdefg@gmail.com");
        assertTrue(email.getAddress().equals("abcdefg@gmail.com"));
    }

    @Test
    public void testEqEmail() {
        var email = new Email("abcdefg@gmail.com");
        var email2 = new Email("abcdefg@gmail.com");
        assertEquals(email, email2);
    }
}