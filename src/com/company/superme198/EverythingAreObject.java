package com.company.superme198;

public class EverythingAreObject {
    /**The default values are only what Java guarantees when the variable is
     * used as a member of a class. This ensures that member variables of
     * primitive types will always be initialized, reducing a source of bugs.
     * However, this initial value may not be correct or even legal for the program
     * you are writing .
     * This guarantee doesn't apply to local variables- those that are not fields of a class */
    int x = 1;
    public static void main(String...args){

        int x = 0;//x must be initialized
        System.out.println(x);
        System.out.println((char) ('a' - 32));
    }
}
