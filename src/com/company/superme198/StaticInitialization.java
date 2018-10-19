package com.company.superme198;

public class StaticInitialization {

    static int i;
    static {
        i = 1;
        System.out.println("static initialization");
    }
    StaticInitialization(){
        System.out.println("constructor");
    }

    public static void main(String...args){

        System.out.println("thanh tai nguyen");
    }
}
