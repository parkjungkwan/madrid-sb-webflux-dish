package net.zerotodev.api.UserService.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ArrayDemoTest {
    @Mock
    ArrayDemo arrayDemo;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        arrayDemo = new ArrayDemo();
    }

    @Test
    void test_fill() {
        String s = "";
        int[] arr = arrayDemo.fill(7);
        for(int i: arr){
            s += i;
        }
        assertEquals("77777", s);
    }

    @Test
    void test_copy() {
        String s = "";
        int[] arr = arrayDemo.copy(new int[]{7,7,7,7,7}, 0, 2, 2);
        for(int i: arr){
            s += i;
        }
        assertEquals("00770", s);
    }
    @Test
    void test_createIntegerArray(){
        int[] arr = arrayDemo.createIntegerArray(1, 6);
        String s = "";
        // int[] arr = {1, 2, 3, 4, 5}
        for(int i: arr){
            // System.out.print(i+"\t");
            s += i;
        }
        assertEquals("12345", s);
    }

}