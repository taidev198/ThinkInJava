package com.company.superme198;

/**
 * Created by traig on 3:28 PM, 11/17/2018
 */
public class NestingInterfaces {
    //implementing a private interface is a way
    //to force the definition of the methods in that interface without
    //adding any type information(that is, without allowing any upcasting).

    //when you  implement an interface, you are not required to implement
    //any interfaces nested within.
    //A private interface cannot be implemented outside of their defining classes.
    private interface A{
     interface B{}
    }




}


//cannot implement a private interface
//except within that interface'S defining class:
//!class xx implementNestingInterface.A{}