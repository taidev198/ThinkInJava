package com.company.superme198;

public class OrderOfInitialization {

    static class Window{
        Window(int marker){
            System.out.println("Window(" + marker+")");
        }
    }

   static class House{
        /**Within a class, the order of initialization is determined by the order that the variables are
         defined within the class. The variable definitions may be scattered throughout and in
         Within a class, the order of initialization is determined by the order that the variables are
         defined within the class. The variable definitions may be scattered throughout and in*/
        Window w1 = new Window(1);
        public  House(){
            //Show that we're in the constructor
            System.out.println("House");
             w3 = new Window(33);//w3 is reinitialized inside constructor
        }

        Window w2 = new Window(2);//After constructor
        void print(){
            System.out.println("print()");
        }
        Window w3 = new Window(3);//At end

    }


    public static void main(String...args){
        House h = new House();
        h.print();
        //output:
        //window(1)
        //window(2)
        //window(3)
        //House
        //window(33)
        //print()
    }
}
