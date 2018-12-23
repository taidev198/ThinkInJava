package com.company.superme198.NestedClasses;

/**
 * Created by traig on 7:31 AM, 11/22/2018
 */
interface Content{
    int value();
}

interface Destination{
    String readLable();
}
public class Parcell1 {

    /**If you don't need a connection between the inner class object and the outer class object, then
     * you can make the inner class static. This is commonly called a nested class. To understand the
     * meaning of static when applied to inner classes, you must remember that the object of an ordinary
     * inner class implicitly keeps a reference to the object of enclosing class that created it.
     * This is not true, however, when you say an inner class is static. A nested class means"
     * 1;You don't need an outer-class object in order to create an object of a nested class.
     * 2:You can't access a non-static outer-class object from an object of a nested class.
     * Nested classes are different from ordinary inner classes in another way, as well. Fields and
     * methods in ordinary inner classes can only be at the outer level of a class, so ordinary inner
     * classes cannot have static data, static fields, or nested class. However, nested classes can
     * all of these.*/

    private static class ParcellContents implements Content{
        private int i =11;
        @Override
        public int value() {
            return i;
        }
    }


    protected static class ParcelDestination implements
            Destination{
        private String label;

        private ParcelDestination(String whereTo){
            label = whereTo;
        }

        @Override
        public String readLable() {
            return label;
        }
        //nested classes can contain other static elements:
        public static void f(){};
        static int x = 10;
    }

    public static Destination destination(String s){
        return new ParcelDestination(s);
    }

    public static Content content(){
        return new ParcellContents();
    }
    /**In ordinary (inner class) non-static class, the link to outer-class
     * object is achieved with a special this reference. A nested class does not
     * have a special this reference, which makes it analogous  to a static method.*/
    public static void main(String...args){
        Content c = content();
        Destination d = destination("t-shirt");
    }
}
