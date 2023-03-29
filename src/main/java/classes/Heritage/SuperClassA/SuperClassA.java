package classes.Heritage.SuperClassA;

import static java.lang.System.out;

public class SuperClassA {

    private int x = 0;
    public int z = 0;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public SuperClassA(){
        out.println("Constructor of the SuperClass without parameters!");
        out.println("Integer x = "+x);
    }

    public SuperClassA(int x){
        out.println("Constructor of the SuperClass with parameters!!!!!");
        out.println("Integer x = "+x);
    }

    public int superInt = 48;

    public int multy(int a, int b){
        return a*b;
    }
}
