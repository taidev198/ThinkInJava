package com.company.superme198.InnerClass;

/**
 * Created by traig on 8:45 AM, 11/20/2018
 */

abstract class base{
    public base(int i){
        System.out.println("base constructor: " + i);
    }
}
public class AnonymousConstructor {
    //What if you need to perform some constructor-activity?
    //You can't have a named constructor in an anonymous class
    //(since there's no name), but with instance initialization,
    //you can, in effect, create constructor for an anonymous inner
    //class

    public base getBase(int i){

        return new base(i) {

            {
                System.out.println("inside instance initializer");
            }
            public void f(){
                System.out.println("in anonymous f();");
            }
        };//the semicolon at the end of the anonymous inner class
        //doesn't mark the end of the class body. instead, it marks
        //the end of expression that happens to contain the anonymous inner
        //class.
    }

    public static void main(String...args){
        AnonymousConstructor anonymousConstructor = new AnonymousConstructor();
        base b = anonymousConstructor.getBase(1);
    }

}
