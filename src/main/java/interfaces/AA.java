package interfaces;

public interface AA {
    int abc();
    default int sqrt(int a){
        return (int) Math.sqrt(a);
    }
    default double sqrt(double a){
        return Math.sqrt(a);
    }
}
