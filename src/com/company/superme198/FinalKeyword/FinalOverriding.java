package com.company.superme198.FinalKeyword;

public class FinalOverriding {

    static class WithFinal{
        //Identical to "private" alone:
        private final void f(){
            System.out.println("WithFinal.f()");
        }

        private void g(){
            System.out.println("WithFinal.g()");
        }
    }

    static class OverridingPrivate extends WithFinal{

        private final void f(){
            System.out.println("OverridingPrivate.f()");
        }

        private void g(){
            System.out.println("OverridingPrivate.g()");
        }
    }

    static class OverridingPrivate2 extends OverridingPrivate{
        public final void f(){
            System.out.println("OverridingPrivate2.f()");
        }

        public void g(){
            System.out.println("OverridingPrivate2.g()");
        }
    }

    public static void main(String...args){

        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();

        OverridingPrivate op = op2;
         op.f();
        op.g();
        WithFinal wt = op2;
         wt.f();
        wt.g();
    }

}
