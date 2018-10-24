package com.company.superme198;

public class Upcasting {

    static class Instrument{
        public void play(){

        }
        static void tune(Instrument i){
            i.play();
        }


    }
    static class Wind extends Instrument{

    }
    public static void main(String...args){
        //Because inheritance means that all of methods in the base class
        //are available in the derived class, any message you can send to the
        //base class can also be sent to the derived class.
        //Win object is also a type of Instrument, so ...
        Wind wind = new Wind();
        Instrument.tune(wind);
    }
}
