package Main;

import annotations.MyTest;
import classes.annotationTest.AnnotationTests;
import classes.gsonTestMapping.Data;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class CustomRunnerForAnnotatedTests {

    public static void main(String[] args) throws Exception {
//        args = new String[]{"classes.annotationTest.AnnotationTests"};
//        int tests = 0;
//        int passed = 0;
//        int failed = 0;
//        Class<?> testclass = Class.forName(args[0]);
//        AnnotationTests annotationTests = new AnnotationTests();
//        for (Method m : testclass.getDeclaredMethods()) {
//            if (m.isAnnotationPresent(MyTest.class)) {
//                tests++;
//                try {
//                    long start ;
//                    long end ;
//                    start = new Date().getTime();
//                    m.invoke(annotationTests);
//                    end = new Date().getTime();
////                    passed++;
//
//                    if(end-start>=m.getAnnotation(MyTest.class).timeout()){
//                        failed++;
//                    }
//                } catch (InvocationTargetException wrappedExc) {
//                    Throwable exc = wrappedExc.getCause();
//                    System.out.println(m + " failed: "+exc);
//                } catch (Exception exc) {
//                    System.out.println("Invalid @Test: "+m);
//                }
//            }
//        }
//        annotationTests=null;
//        System.out.printf("Пройдено: %d, Сбоев: %d",
//                passed, tests - passed);
    }
//        TerritoriesInfo territoryInfo = new TerritoriesInfo("У Испании 6 провинций, У России 10 провинций, У Франции 8 провинций");
//
//        int l = territoryInfo.toString().length();
//
//        String s = "У Испании 6 провинций, У России 10 провинций, У Франции 8 провинций";
//        char buf[] = new char[20];
//        int s1 = s.length();
////        char arr[] = new char[20];
//        s.getChars(50,s1,buf,0);
//        char symbol = s.charAt(2);
//        out.println(l);
//        out.println(s);
//        out.println(buf);
//        out.println(symbol);

}
