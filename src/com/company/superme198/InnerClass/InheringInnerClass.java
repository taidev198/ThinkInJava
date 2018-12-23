package com.company.superme198.InnerClass;

/**
 * Created by traig on 5:24 PM, 11/27/2018
 */

class WithInner{
     class Inner{

    }

}
public class InheringInnerClass extends WithInner.Inner {
    /**The InheringInner is extending  only the inner class, not the outer one. But when
     * it comes time to create a constructor, the default one is no good, and you can't just pass
     * a reference to an enclosing object. In addition to, you must you the syntax:
     * enclosingClassReference.super();
     * inside the constructor. This provides the necessary reference, and the program will then compile.*/
     InheringInnerClass(WithInner wi){
        wi.super();
    }

    public static void main(String...args){
         WithInner wi = new WithInner();
         InheringInnerClass inheringInnerClass = new InheringInnerClass(wi);
    }
}
