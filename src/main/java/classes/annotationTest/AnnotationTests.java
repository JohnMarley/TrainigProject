package classes.annotationTest;

import annotations.MyTest;
import org.junit.Test;

import java.sql.Time;
import java.util.HashSet;
import java.util.Set;

public class AnnotationTests {

    private final char first;
    private final char second;

    public AnnotationTests(char first, char second){
        this.first=first;
        this.second=second;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof AnnotationTests))
            return false;
        AnnotationTests a = (AnnotationTests) o;
        return a.first == first && a.second == second;
    }
//    public boolean equals(AnnotationTests a){
//        return a.first == first && a.second == second;
//    }
    public int hashCode(){
        return 31 * first + second;
    }


    @MyTest(timeout = 1000)
    public static void firstAnnotationTest(){
        System.out.println("First annotated test is passed!!!!!");
    }

}
