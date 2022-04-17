package com.company;

import java.util.Hashtable;

public class Main {
    public static void main(String args[]) {
	// write your code here
        Hashtable<Integer, String> table  = new Hashtable<>(10);

        table.put(100,"Vikas Maurya");
        table.put(101,"Shivanand Maurya");
        table.put(102,"Anjali Maurya");

        table.remove(102);

        for (Integer key: table.keySet()){
        System.out.println(key.hashCode()+"\t"+key+"\t"+table.get(key));

        }
    }
}
