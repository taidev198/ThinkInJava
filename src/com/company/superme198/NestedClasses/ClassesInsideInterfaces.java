package com.company.superme198.NestedClasses;

/**
 * Created by traig on 8:02 AM, 11/22/2018
 */


/**Normally, you can't put any code inside interface, but a nested class can be a part of
 * an interface. Any class you put inside an interface is automatically public and static. Since
 * the class is static, it doesn't violate the rules for interfaces - the nested class is only
 * placed inside the namespace of the interface. You can even implement the surrounding interface
 * in the inner class.*/
interface ClassInInterface{
    void howdy();
    class Test implements ClassInInterface{

        @Override
        public void howdy() {
            System.out.println("Howdy!");
        }
    }
}
public class ClassesInsideInterfaces {

public static void main(String...args){
    new ClassInInterface.Test().howdy();
}
}
