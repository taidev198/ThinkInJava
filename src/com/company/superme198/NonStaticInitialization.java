package com.company.superme198;

public class NonStaticInitialization {

    class Mug{
        public Mug(int market){
            System.out.println("Mug(" +market +")");
        }
        void f(int market){
            System.out.println("f(" + market +")");
        }
    }
    class Mugs{
        Mug mug1 ;
        Mug mug2;
        {
            mug1 = new Mug(1);
            mug2 = new Mug(2);
            System.out.println("non-static instances are initialized ");
        }
        public Mugs(){
            System.out.println("Mugs()");
        }
        public Mugs(int i){
            System.out.println("Mugs(" + i+")");
        }
    }

}
