package com.company.superme198.InnerClass;

/**
 * Created by traig on 7:18 AM, 11/22/2018
 */
 interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
     Service getService();
}

class Implementation1 implements Service{

     private Implementation1(){}

     public static ServiceFactory factory = new ServiceFactory() {
         @Override
         public Service getService() {
             return new Implementation1();
         }
     };

    @Override
    public void method1() {
        System.out.println("Implementation1 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation1 method2");
    }
}

class Implementation2 implements Service{
    private Implementation2(){}

    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation2();
        }
    };


    @Override
    public void method1() {
        System.out.println("Implementation2 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2 method2");
    }
}
public class Factoties {

     public static void serviceConsumer(ServiceFactory fact){
         Service s = fact.getService();
         s.method1();
         s.method2();
     }

     public static void main(String...args){
         serviceConsumer(Implementation1.factory);
         serviceConsumer(Implementation2.factory);
     }

}
