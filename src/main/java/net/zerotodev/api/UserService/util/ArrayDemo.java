package net.zerotodev.api.UserService.util;

import java.util.Arrays;

public class ArrayDemo {

    public int[] fill(int number){
        int[] arr = new int[5];
        Arrays.fill(arr, 7);
        return arr;
    }
    public int[] copy(int[] param, int initVal, int start, int lenght ){
        int[] arr = new int[5];
        System.arraycopy(param, initVal, arr, start, lenght);
        return arr;
    }
}
