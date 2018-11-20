package com.company.superme198.InnerClass;

/**
 * Created by traig on 6:51 AM, 11/19/2018
 */
public class DotThisInnerClass {

    void f(){
        System.out.println("DotThisInnerClass.f()");
    }
    public class  Inner{
        public  DotThisInnerClass Outer(){
            return DotThisInnerClass.this;//A plain "this" would be Inner's "this";
        }


    }
    public Inner inner(){
        return new Inner();
    }

    public static void main(String...args){
        DotThisInnerClass dot = new DotThisInnerClass();
        DotThisInnerClass.Inner dt = dot.inner();
        dt.Outer().f();//output:"DotThisInnerClass.f()"
    }

}
