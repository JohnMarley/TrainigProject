package classes.Heritage.SubClasssB;

import classes.AbstractClasses.Abstract;
import classes.Heritage.PrivateClassC.PrivateClassC;
import classes.Heritage.SuperClassA.SuperClassA;
import org.apache.commons.lang3.NotImplementedException;

import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
//        Collections ;
//        List<String>;
//        Map<String, Object> a = new LinkedHashMap<>();
//         a = new Hashtable<>();
//        int c = super.multy(a, b);
//        return (c - a/b)+super.superInt + superInt;
        return 0;
    }


}
