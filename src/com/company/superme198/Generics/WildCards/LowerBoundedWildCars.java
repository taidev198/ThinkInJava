package com.company.superme198.Generics.WildCards;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by traig on 8:02 AM, 12/28/2018
 */
public class LowerBoundedWildCars {

    /**A lower bounded wildcard restricts the unknown type to be a specific type or super type of that. */

    //this method works on lists of Integer and the super type of Integer, such as
    //Integer, Number, Object, so you must specify List<? super Integer>.
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o));
            list.add(i);
        }
    }
}
