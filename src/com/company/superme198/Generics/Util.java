package com.company.superme198.Generics;

/**
 * Created by traig on 8:31 PM, 12/25/2018
 */
public class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2){
        return p1.getKey().equals(p2.getKey())
                && p1.getValue().equals(p2.getValue());
    }

    public static void main(String...args){
        Pair<Integer, String> p1 = new Pair<>(2, "pear");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
        boolean same = Util.compare(p1, p2);
        System.out.println(same);
    }
}
