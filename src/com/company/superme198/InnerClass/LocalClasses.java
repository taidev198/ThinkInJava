package com.company.superme198.InnerClass;

/**
 * Created by traig on 7:14 AM, 11/20/2018
 */
public class LocalClasses {
    interface Destination{
        String readLabel(String label);
    }
    public Destination destination(){
        //local class.
        class PDestination implements Destination{
            private String label;
            public PDestination(String whereTo){
                label = whereTo;
            }
            @Override
            public String readLabel(String label) {
                return label;
            }
        }
        return new PDestination("t-shirt");
    }

   private class PDestination implements Destination{
        private String label;
        public PDestination(String whereTo){
            label = whereTo;
        }
        @Override
        public String readLabel(String label) {
            return label;
        }
    }

    public Destination getInstance(){
        return new PDestination("shoes");
    }

    public static void main(String...args){
       LocalClasses localClasses = new LocalClasses();
       Destination des = localClasses.destination();

       Destination pDestination =  localClasses.getInstance();//cannot access to pd.label or getinstance
        System.out.println();
    }

}
