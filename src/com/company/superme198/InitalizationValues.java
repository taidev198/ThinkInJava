package com.company.superme198;

public class InitalizationValues {
    boolean b;
    int i;
    double d;
    float f;
    char c;//automatically init to a space ' '.
    short s;
    byte aByte;
    InitalizationValues reference;
    void printInitialValues(){
        System.out.println("Data default Value:");
        System.out.println("boolean = " + b);
        System.out.println("int = " + i);
        System.out.println("double = " + d);
        System.out.println("float = " + f);
        System.out.println("char = " + c);
        System.out.println("short = " + s);
        System.out.println("byte = " + aByte);
    }

    public static void main(String...args){
        InitalizationValues iv = new InitalizationValues();
        iv.printInitialValues();
        new InitalizationValues().printInitialValues();

    }
}
