package com.vikas;

import java.util.ArrayList;
import java.util.Arrays;

public class ValueSwap {
    public static void main(String[] args) {
        int[] list = {1,2,3,4};
//        swap(list,1,3);
        System.out.println(Arrays.toString(list));
    }

    public static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}
