package com.company.superme198.InitializationAndClassLoading;

public class InitailizationWithInheritance {

    static class Insect{
        private int i =9;
        protected int j;
        Insect(){
            System.out.println("i= " + i+ "j =" +j);
            j=39;
        }

        private static int x1 = printInit("static Insect.x1 initialized");
         static int printInit(String s){
             System.out.println(s);
             return 47;
         }

    }

    static class Beetle extends Insect{
         private int k = printInit("Beetle.k initialized");
         public Beetle(){
             System.out.println("k = " +k + "j=" +j);
         }
         private static int x2 = printInit("Beetle.x2 initialized");


         public static void main(String...args){
             Beetle b = new Beetle();
         }
     }

}
