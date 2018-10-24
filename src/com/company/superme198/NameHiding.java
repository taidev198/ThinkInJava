package com.company.superme198;

public class NameHiding {
    /**If a Java base has a method name that's overloaded several times, redefining that method
     * name in the derived class will not hide any of the base- class versions. thus
     * overloading works regardless of whether the method was defined at this level or
     * in an base class.*/

   static class Homer{
        char doh(char c){
            System.out.println("doh(char)");
            return 'd';
        }

        float doh(float f){
            System.out.println("doh(float)");
            return 1.0f;
        }
    }

    static class Milhouse{}

    static class Bart extends Homer{
       void doh(Milhouse milhouse){
           System.out.println("doh(Milhouse)");
       }
    }



    public static void main(String...args){
       //All the overloaded methods of Homer are available in Bart
        //Even though Bart introduces a new overloaded method
       Bart b = new Bart();
       b.doh('c');
       b.doh(1.0f);
       b.doh(new Milhouse());
    }
}
