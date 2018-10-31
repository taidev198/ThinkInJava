package com.company.superme198.FinalKeyword;

public class BlankFinals {

    private final int i = 0;//initialized final
    private final int j;//blank final
    private final BlankFinals blankFinals;// blank final reference
    //blank final must be and only initialized in constructor

    public BlankFinals(){
        j  = 1;//Initialize blank final
        blankFinals = new BlankFinals();
    }

    public BlankFinals(int x){
        j = x;//Initialize blank final.
        blankFinals = new BlankFinals(x);//Initialize blank final reference.
    }
}
