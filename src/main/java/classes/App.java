package classes;

import interfaces.AA;

public class App implements AA {

    public void f(NullPointerException e){
        try{
            throw e;
        }
        catch (NullPointerException n){
            f(n);
        }
    }

    public String exception(){
        try {
            throw new Exception();
//            return "SomeString";
        } catch (Exception ex) {
            return "Catch message";
        } finally {
            return "Finally message";
        }
    }

    public int abc(){
        return 0;
    }
}
