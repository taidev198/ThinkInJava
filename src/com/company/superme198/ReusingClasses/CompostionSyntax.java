package com.company.superme198.ReusingClasses;

public class CompostionSyntax {

    /**1:At the point the objects are defined. This means that they'll always be
     * initialized before the constructor is called.
     *2:In the constructor for that class.
     * 3:Right before you actually need to use the object. This if often called lazy
     * initialization. It can reduce overhead in situations where object creation is expensive
     * and the object doesn't need to created every time.
     * 4: Using instance initialization.
     * */


    /**OUTPUT:
     * Inside Bath()
     * Soap()
     * s1 = Happy
     * s2 = Happy
     * s3 = Joy
     * s4 = Joy
     * i = 47
     * toy = 4.14
     * castille = Constructed*/

    static class Soap{
        private String s;
        Soap(){
            System.out.println("Soap()");
            s = "Constructed";
        }
        public String toString(){ return s;}

    }

    static class Bath{
        private String//initializing at point of definition
            s1 = "Happy",
        s2 = "Happy",
        s3 ,s4;

        private Soap castille;
        private int i;
        private float toy;
        public Bath(){
            System.out.println("Inside Bath()");
            s3 = "Joy";
            toy = 4.14f;
            castille = new Soap();
        }

        //Instance initialization:
        { i =47;}
        public String toString(){
            if ((s4 == null))//delayed initialization
                s4 = "Joy";
            return "s1 = "+s1 +
                    "\ns2 = "+s2 +
                    "\ns3 = "+s3 +
                    "\ns4 = "+s4 +
                    "\ni = "+i +
                    "\ntoy = "+toy +
                    "\ncastille = "+castille ;
        }

    }

    public static void main(String...args){

        Bath b = new Bath();
        System.out.println(b);
    }
}
