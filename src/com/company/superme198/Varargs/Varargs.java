package com.company.superme198.Varargs;

import java.util.Arrays;
import java.util.Comparator;

public class Varargs {


    static void print(Integer...args){

        for (Integer i:
            args ) {
            System.out.println(i);
        }
    }

    public static void main(String...args){

        print(new Integer[]{1,2,3,4});
    }
}
