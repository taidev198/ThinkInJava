package com.company.superme198.Interface;

public class NameCollision {

    interface I1{void f();}
    interface I2 { int f(int i);}
    interface I3 { int f();}

    class C {
        public int f(){
            return 1;
        }
    }

    class C2 implements I1, I2{

        @Override
        public void f() {

        }

        @Override
        public int f(int i) {
            return 1;
        }

    }

    class C3 extends C implements I2{

        @Override
        public int f(int i) {
            return 1;
        }
    }

    class C4 extends C implements I3{
        //identical, no problem.

        public int f(){
            return 1;
        }
    }
    //if the derived class extends class and implements interface
    //all of them has the same method, then the method in them is
    //overloaded by derived class.
    //cannot extends C and implements I1 because void f(); and int f(); are
    // not overloaded methods.
    //class C5 extends C implements I1{}

}
