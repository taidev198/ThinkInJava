package com.company.superme198.Generics.BoundedTypedParameters;

/**
 * Created by traig on 8:47 PM, 12/27/2018
 */
//In addition to limiting  the types you can use to
    //instantiate a generic type, bounded type parameters allow
    //you tp invoke methods in the bounds
public class NaturalNumber<T extends Integer> {

    private T n;
    public NaturalNumber(T n){this.n = n;}

    public boolean isEven(){
        return n.intValue() % 2==0;//invoking intValue method in bound
    }
}
