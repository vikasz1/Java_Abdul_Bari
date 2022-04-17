package com.vikas;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        System.out.println("hello");
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(122);
        list.add(23);
        list.add(23);
        list.add(54);
        list.add(1222);
        System.out.println(list);
        list.set(0,99);
        System.out.println(list);
    }
}
