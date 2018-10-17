package com.company.superme198;

public class CallingConstructorsFromConstructors {
    /***/

    class Flower {
        int petalCount = 0;
        String s = "initial value";
        Flower(String ss){
            s = ss;
        }

        Flower(int petals){
            petalCount = petals;
        }

        Flower(int petals, String ss){
            this(petals);
            //this.(ss); cannot call two!
            s = ss;

        }
        Flower(){
            this(50, "tai");
        }
    }
}
