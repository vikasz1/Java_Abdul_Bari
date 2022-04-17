package com.vikas;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimArray {

        public static void main(String[] args) {

            Scanner in= new Scanner(System.in);
            ArrayList<ArrayList<Integer>> list2d = new ArrayList<>();
            // Initializin the array
            for (int i = 0; i < 3; i++) {
                list2d.add(new ArrayList<>());
            }

            // PUtting data into the array
            for (int i = 0; i <3; i++) {
                for (int j = 0; j < 3; j++) {
                    list2d.get(i).add(in.nextInt());

                }
            }
        }
    }
