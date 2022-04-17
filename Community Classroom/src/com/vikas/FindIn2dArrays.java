package com.vikas;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindIn2dArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {3,4,56},
                {0,1,2,4,6,4,2,1,2,3,440,5}
        };
        int[] answer = findIn2d(arr,56);
        System.out.println(Arrays.toString(answer));
        System.out.println(findMax(arr));

    }

    private static int findMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    private static int[] findIn2d(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) return new int[]{row, col};
            }

        }
        return new int[]{-1};
    }


}
