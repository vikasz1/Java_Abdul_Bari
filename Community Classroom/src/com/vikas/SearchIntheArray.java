package com.vikas;

public class SearchIntheArray {
    // search for an item in the array and return its index.
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6,6,7,3};
        int index = linearSearch(a,6);
        System.out.println(index);

    }

    private static int linearSearch(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            if(a[i]==target){
                return i;
            }
        }
        return -1;
    }
}
