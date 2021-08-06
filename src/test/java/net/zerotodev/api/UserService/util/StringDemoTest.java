package net.zerotodev.api.UserService.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class StringDemoTest {
    @Mock StringDemo stringDemo;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        stringDemo = new StringDemo();
    }

    @Test
    void concat() {
        assertEquals("CoffeeBread", stringDemo.concat("Coffee","Bread"));
    }

    @Test
    void substring() {
        assertEquals("cdefg", stringDemo.substring("abcdefg",2));
    }

    @Test
    void testSubstring() {
        assertEquals("cde", stringDemo.substring("abcdefg", 2, 5));
    }

    @Test
    void compareTo() {
        assertEquals(0, stringDemo.compareTo("abc","abc"));
    }

    @Test
    void compareToIgnoreCase() {
        assertEquals(0, stringDemo.compareToIgnoreCase("abc","ABC"));
    }

    @Test
    void removeHyponeInJuminBunho() {
        assertEquals("8009091234567", stringDemo.removeHyponeInJuminBunho("800909-1234567"));
    }
}