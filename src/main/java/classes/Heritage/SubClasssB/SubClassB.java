package classes.Heritage.SubClasssB;

import classes.AbstractClasses.Abstract;
import classes.Heritage.PrivateClassC.PrivateClassC;
import classes.Heritage.SuperClassA.SuperClassA;

import static java.lang.System.in;
import static java.lang.System.out;

public class SubClassB extends SuperClassA {

    int b = 0;

    public SubClassB(){
//        super(); // call default superClass constructor is not nesessary because it's called by default upon subClass object creation
        out.println("Constructor of the SubClass without parameters");
        out.println("SubClass Integer b = "+b+"\nSuperClass Integer x = "+getX());
    }

    public SubClassB(int b){
        super(5); // call superClass constructor if you want to pass parameters to it
        out.println("Constructor of the SubClass with parameters!!!!");
        out.println("Integer b = "+b);
    }

    int superInt = 10;

    public int multy(int a, int b){
        int c = super.multy(a, b);
        return (c - a/b)+super.superInt + superInt;
    }


}
