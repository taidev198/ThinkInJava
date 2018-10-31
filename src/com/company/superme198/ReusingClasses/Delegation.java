package com.company.superme198.ReusingClasses;

public class Delegation {

 static  class SpaceShipControls{
        void up(int velocity){}
        void down(int velocity){}
        void left(int velocity){}
        void right(int velocity){}
        void back(int velocity){}
        void forward(int velocity){}
    }

    static class SpaceShip extends SpaceShipControls{
        private String name;

        SpaceShipControls controls = new SpaceShipControls();
        public SpaceShip(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
        //delegated methods:
        public void back(int velocity) {
            controls.back(velocity);
        }
        public void down(int velocity) {
            controls.down(velocity);
        }
        public void forward(int velocity) {
            controls.forward(velocity);
        }
        public void left(int velocity) {
            controls.left(velocity);
        }
        public void right(int velocity) {
            controls.right(velocity);
        }

        public void up(int velocity) {
            controls.up(velocity);
        }


    }

    public static void main(String...args){

     SpaceShip spaceShip = new SpaceShip("thanh tai nguyen");
     spaceShip.right(1);
    }

}
