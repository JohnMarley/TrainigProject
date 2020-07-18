package Tests;

import classes.App;
import classes.ReflectionExample;
import classes.annotationTest.AnnotationTests;
import classes.builder.NutritionFacts;
import classes.phoneNumber.PhoneNumber;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class allTests {

    @Test
    public void nutritionBuilderTest(){
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(10,100)
                .calories(200)
                .fat(10)
                .build();
    }

    @Test
    public void arrayTest(){

        int[] array = new int[10];
//        String[] arrayS = new String[10];
//        Object[] arrObj = new Object[10];
//        String[] arrStr = new String[10];
        long startFillingArray = new Date().getTime();
        List<Integer>arraylist = new ArrayList<>();
        for (int i = 0; i < 50000000; i++) {
            arraylist.add(i);
        }

        long finishFillingArray = new Date().getTime();
        long arrayResult = finishFillingArray - startFillingArray;

        List<Integer>linkedList= new LinkedList<>();
        long startLinked = new Date().getTime();
        for (int i = 0; i < 50000000; i++) {
            linkedList.add(i);
        }
        long finishList = new Date().getTime();
        long linkedResult = finishList-startLinked;
        System.out.println("arrayFilling: "+arrayResult);
        System.out.println("Linkedfilling: "+linkedResult);

        List<Integer>subArrayList=new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            subArrayList.add(i);
        }
        long startArrayInserting = new Date().getTime();
        arraylist.addAll(25000000,subArrayList);
        long endArrayInserting = new Date().getTime();
        long resultArrayInserting = endArrayInserting-startArrayInserting;

        System.out.println("ArrayInserting "+resultArrayInserting);

        List<Integer>subLinkedList=new LinkedList<>();
        for (int i = 0; i <100 ; i++) {
            subLinkedList.add(i);
        }
        long startinkedInserting = new Date().getTime();
        linkedList.addAll(25000000,subLinkedList);
        long endLinkedInserting = new Date().getTime();
        long resultLinkedInserting = endLinkedInserting-startinkedInserting;
        System.out.println("LinkedInserting "+resultLinkedInserting);

        long start = new Date().getTime();
        arraylist.get(25000000);
        long end = new Date().getTime();
        long res = end-start;
        System.out.println("arrayGet: "+res);
        start = new Date().getTime();
        linkedList.get(25000000);
        end = new Date().getTime();
        res = end-start;
        System.out.println("linkedGet: "+res);

    }

    @Test
    public void aVoid(){

//        Map<Object,String>map = new HashMap<>(16,0.75f);
//        Object object = new Object();
//        Object object1 = new Object();
//        Object object2 = new Object();
//        map.put(object,"object");
//        map.put(object1,"object1");
//        map.put(object2,"object2");
//
//        for (Map.Entry<Object, String> entry :map.entrySet()) {
//            entry.getKey();
//        }

        Set<String>set=new HashSet<>();
        set.add("as");
        set.add("sa");
        set.iterator();
        for (String a:set) {
            System.out.println(a);
        }
//        map.put(object,"object");
//        System.out.println(map.size());
//        object = null;
//        System.gc();
//        System.runFinalization();
//        System.out.println(map.size());



    }

    @Test
    public void overFlow(){
        App app = new App();
        app.f(null);
    }

    @Test
    public void exception(){
//        App app = new App();
//        String a = app.exception();
//        System.out.println(a);
        String testString = "This is a test string.";
        String[] resultArray = testString.split(" ");
    }

    @Test
    public void equalsTest(){
//        AnnotationTests annotationTests = new AnnotationTests();
//        AnnotationTests annotationTests1 = new AnnotationTests();
//
//        boolean a = annotationTests.equals(annotationTests1);
//
//        System.out.println(a);
    }

    @Test
    public void listTEst(){
        Set<AnnotationTests>set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            for (char j = 'a'; j <= 'z' ; j++) {
                set.add(new AnnotationTests(j,j));
            }
        }
        System.out.println(set.size());
        Object[][] objects = {{2, true,2,false}};
    }

    @Test
    public void reflectionTest(){
        ReflectionExample reflectionExample = new ReflectionExample();
        String name=null;
        try {
            Field field = reflectionExample.getClass().getDeclaredField("name");
            field.setAccessible(true);
//            name = (String) field.get(reflectionExample);
            field.set(reflectionExample,"new Value!!!");
//            name = "new Value!!!";
            Method method = reflectionExample.getClass().getDeclaredMethod("printData");
            method.setAccessible(true);
            method.invoke(reflectionExample);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void phoneNumberTest(){
        PhoneNumber phoneNumber = new PhoneNumber("Jenn","0123");

        phoneNumber.toString();
        PhoneNumber phoneNumberClone = phoneNumber.clone();
        phoneNumber.equals(phoneNumberClone);
        boolean a = phoneNumber==phoneNumberClone;
        System.out.println(a);
    }
}
