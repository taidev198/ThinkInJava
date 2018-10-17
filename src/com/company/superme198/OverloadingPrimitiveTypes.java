package com.company.superme198;

public class OverloadingPrimitiveTypes {



    static public void f(int x){
        System.out.println("f(int)");
    }
    static public void f(short x){
        System.out.println("f(short)");
    }
    static public void f(long x){
        System.out.println("f(long)");
    }
    static public void f(byte x){
        System.out.println("f(byte)");
    }
    static public void f(double x){
        System.out.println("f(double)");
    }

    static public void f(float x){
        System.out.println("f(float)");
    }

    static public void f1(int x){
        System.out.println("f1(int)");
    }
    static public void f1(short x){
        System.out.println("f1(short)");
    }
    static public void f1(long x){
        System.out.println("f1(long)");
    }
    static public void f1(byte x){
        System.out.println("f1(byte)");
    }
    static public void f1(double x){
        System.out.println("f1(double)");
    }

    static public void f1(float x){
        System.out.println("f1(float)");
    }


    static public void f2(int x){
        System.out.println("f2(int)");
    }
    static public void f2(short x){
        System.out.println("f2(short)");
    }
    static public void f2(long x){
        System.out.println("f2(long)");
    }
    static public void f2(byte x){
        System.out.println("f2(byte)");
    }
    static public void f2(double x){
        System.out.println("f2(double)");
    }

    static public void f2(float x){
        System.out.println("f2(float)");
    }

    public static void main(String...args){
        /**A primitive can be automatically promoted from smaller type to a larger one,
         * and this can be slightly confusing in combination with overloading.
         * If you have a data type that is smaller than the argument in the method,
         * that data type is promoted. char procedures a slightly different effect,
         * since if it doesn't find an exact char match, it is promoted to INT*/

        /**If your argument is wider, then you must perform a narrowing conversion with a cast.
         * If you don't do this, the compiler will issue an error message.*/

        /**you cannot use return value types to distinguish
        * overloaded methods.
        * ex: void f(){};
         * int f(){};
        * This might work fine as long as the compiler could unequivocally determine the meaning
        * from the context, as in int x = f( ). However, you can also call a method and ignore the
        * return value. This is often referred to as calling a method for its side effect, since you don’t
        * care about the return value, but instead want the other effects of the method call. So if you
        * call the method this way:
        * f();*/
        int x =1;
        f(5);
        f1(5);
        f2(5);
        f('5');
        f1('5');
        f2('5');
        f(5.5);
        f1(5.5);
        f2(5.5);
    }
}
