package com.company.superme198.InnerClass;

/**
 * Created by traig on 6:59 AM, 11/19/2018
 */
public class DotNew {

    /**Sometimes you want to tell some other object to create an object of one of its
     * inner classes. To do this you must provide a reference to the other outer-class object in the
     * new expression, using .new syntax:*/
    private class Inner{

        private String str = "t";
    }

    /**To create an object of the inner class directly, you don't follow the same
     * form and refer to the outer class name 'DotNew' as you might expect, but
     * instead you must you an object of the outer class to make an object of the
     * inner class, so you don't say dn.new DotNew.Inner()
     *
     * the outer class cannot access to the private member in inner class*/
    public static void main(String...args){
        DotNew dn = new DotNew();
        DotNew.Inner dnn = dn.new Inner();
        System.out.println(dnn.str);
    }
}
