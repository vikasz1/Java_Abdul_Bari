package com.vikas;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

import static com.vikas.ValueSwap.swap;

public class MaximumItemfind {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println(findmax(arr));
//        int a = findmaxinRange(arr,10,14);
//        System.out.println(a);
        reverse(arr);


    }
    static void reverse(int[] arr){
        int start=  0;
        int end = arr.length-1;
        while (start<end){
            swap(arr,start,end);
            System.out.println(Arrays.toString(arr));
            start++;
            end--;
        }

    }

    private static int findmaxinRange(int @NotNull [] arr, int start, int end) {
        //Assuming the array is not empty
        if (arr==null){
            return -1;
        }
        if (start>end){
            return -1;
        }
        int max = arr[start];
        for (int i = start; i < end+1; i++) {
            if (arr[i]>max) max = arr[i];
        }
        return max;
    }

    private static int findmax(int[] arr) {
        //Assuming the array is not empty
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) max = arr[i];
        }
        return max;
    }
}
