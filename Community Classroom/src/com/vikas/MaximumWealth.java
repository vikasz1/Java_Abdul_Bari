package com.vikas;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] person = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };

        int wealth = Integer.MIN_VALUE;
        for (int row = 0; row < person.length; row++) {
            int sum = 0;
            for (int col = 0; col < person[row].length; col++) {
                sum += person[row][col];
            }
            if (sum > wealth) wealth = sum;
        }
        System.out.println(wealth);
    }

}
