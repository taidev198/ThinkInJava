package com.company.superme198;

class Bird{

    public Bird(int x){};
}
public class NoSynthesis {

    public static void main(String...args){
        /**If you create a class has no default method,
         * when you create a object of this class, the compiler will
         * automatically create a default constructor .
         * But you has no default method then you create a object by new className()
         * the compiler will get you a error.*/
        Bird bird = new Bird(1);
    }

}
