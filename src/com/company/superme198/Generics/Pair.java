package com.company.superme198.Generics;

/**
 * Created by traig on 8:31 PM, 12/25/2018
 */
public class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }
    public V getValue() { return value; }
}