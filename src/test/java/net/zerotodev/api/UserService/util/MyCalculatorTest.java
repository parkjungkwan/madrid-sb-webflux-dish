package net.zerotodev.api.UserService.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MyCalculatorTest {
    @Mock
    MyCalculator myCalculator;
    @BeforeEach
    void setup(){
        MockitoAnnotations.initMocks(this);
        myCalculator = new MyCalculator();
    }

    @Test
    void plus() {
        assertEquals(5, myCalculator.plus(2,3));
    }

    @Test
    void minus() {
        assertEquals(-1,myCalculator.minus(2,3));
    }

    @Test
    void divide() {
        assertEquals(6,myCalculator.multi(2,3));
    }

    @Test
    void multi() {
        assertEquals(0,myCalculator.divide(2,3));
    }
}