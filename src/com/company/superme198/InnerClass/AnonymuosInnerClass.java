package com.company.superme198.InnerClass;

/**
 * Created by traig on 7:38 AM, 11/20/2018
 */
public class AnonymuosInnerClass {

    //return instance of anonymuos inner class
    public Contents contents(){

        return new Contents(){
          private int i =11;
          public int value(){return i;}
        };
    }

    private class Contents {
    }
}
