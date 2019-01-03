package com.company.superme198.Generics;

import java.util.Arrays;

/**
 * Created by traig on 2:33 PM, 12/25/2018
 */
public class TwoTuple<A, B> {

    public final A first;
    public final B second;

    public TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }



    public String toString(){

        Arrays.stream(new int[]{1}).max();
        return "(first" + "," + "second)";
    }
}
