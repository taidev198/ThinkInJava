package com.company.superme198.InnerClass;

/**
 * Created by traig on 4:27 PM, 11/17/2018
 */
 interface Selector{
    boolean end();
    Object current();
    void next();
}
public class InnerClass{
    //When you create an inner class, an object of that inner class
    //has a link to the closing object that made it, and so it can
    //access the members of that enclosing object - without any special
    //qualifications(sự hạn chế). In addition, inner class have access
    //rights to all the members in the enclosing class.

    private Object[] items;
    private int next =0;
    public InnerClass(int size){
        items = new Object[size];
    }
    public void add(Object x){
        items[next++] = x;
    }

    private class SequenceSelector implements Selector{
        private int i =0;
        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) i++;
        }


    }
    public Selector getSelector(){ return new SequenceSelector();}
    public static void main(String...args){
        InnerClass innerClass = new InnerClass(10);
        for (int i = 0; i < 10; i++) {
            innerClass.add(i);
        }
        Selector selector = innerClass.getSelector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}
