package com.company.superme198.FieldsAndStaticMethods;

public class Fields {
   static class Super{
        public int field = 0;
        public int getField(){
            return field;
        }
    }

   static class Sub extends Super{

        public int field = 1;
        public int getField(){
            return field;
        }
        public int getSuperField(){
            return super.field;
        }
    }

        public static void main(String...args){
            //Only ordinary method calls can be polymorphic.
            Super sup = new Sub();//upcast.
            System.out.println("sup.field=" +  sup.field + ". Sup.getField():" +
                    sup.getField());

            Sub sub = new Sub();
            System.out.println("sup.field=" +  sub.field + ". Sup.getField():" +
                    sub.getField());
        }


}
