package com.company.superme198.Generics.WildCards;

import java.util.List;

/**
 * Created by traig on 7:54 AM, 12/28/2018
 */
public class UpperBoundedWildCars {
    /**the upper bounded wildcars  restrict the unknown type to be a specific type
     * or subtype of that type and is represented  using the extend keyword.*/
    public static double sumOfList(List<? extends Number> list){
        double s = 0.0;
        for (Number number:
             list) {
            s += number.doubleValue();
        }
        return s;
    }

    public static void main(String...args){

    }
}
