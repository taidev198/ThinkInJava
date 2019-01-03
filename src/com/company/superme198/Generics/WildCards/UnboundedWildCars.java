package com.company.superme198.Generics.WildCards;

import java.util.List;

/**
 * Created by traig on 8:01 AM, 12/28/2018
 */
public class UnboundedWildCars {
    //print all list of any type
    public static void printList(List<?> list) {
        for (Object elem: list)
            System.out.print(elem + " ");
        System.out.println();
    }
}
