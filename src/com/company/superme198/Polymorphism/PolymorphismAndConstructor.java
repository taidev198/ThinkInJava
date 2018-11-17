package com.company.superme198.Polymorphism;

public class PolymorphismAndConstructor {

    static class Glyph{
        Glyph(){
            System.out.println("Glyph() before draw()");
            draw();
            System.out.println("Glyph() after draw()");
        }

        void draw(){
            System.out.println("Glyph.draw()");
        }
    }

    static class RoundGlyph extends Glyph{

        private int radius =1;
        RoundGlyph(int r ){
            radius = r;
            System.out.println("RoundGlyph.RoundGlyph(), radius =" + radius);
        }

        void draw(){
            System.out.println("RoundGlyph.draw(), radius = " + radius);
        }
    }

    public static void main(String...args){
        //output:Glyph() before draw()
        //RoundGlyph.draw(), radius = 0
        //Glyph() after draw()
        //RoundGlyph.RoundGlyph(), radius =5
        //when base class's constructor calls overridden method the variable can be default value =0
        //instead
        // default initial value =1.
        new RoundGlyph(5);
    }

}
