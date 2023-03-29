package Tests;

import patterns.builder.Nutrients;
import abstraction.animals.Tiger;
import abstraction.food.Grass;
import abstraction.food.Meat;
import classes.App;
import classes.ReflectionExample;
import classes.annotationTest.AnnotationTests;
import classes.builder.NutritionFacts;
import classes.phoneNumber.PhoneNumber;
import interfaces.Converter;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;

public class allTests {

    @Test
    public void nutritionBuilderTest(){
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(10,100)
                .calories(200)
                .fat(10)
                .build();
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
        AnnotationTests annotationTests = new AnnotationTests('c', 'x');
        AnnotationTests annotationTests1 = new AnnotationTests('x', 'c');

        boolean a = annotationTests.equals(annotationTests1);

        System.out.println(a);
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

    @Test
    public void java8Test(){
        List<Integer>collection = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            collection.add(i);
        }
        Integer sumOdd = collection.stream().filter(o -> o%2 !=0).reduce((s1,s2) -> s1 +s2).orElse(0);
        System.out.println("Hot fix");
        System.out.println(sumOdd);

    }

    @Test
    public void fUnterfaceTest(){
        Converter<String, Integer> converter = Integer::valueOf;//from -> Integer.valueOf(from);
        var a = converter.covert("123");
        System.out.println(a.getClass().getName());
    }

    @Test
    public void secondBranchTest(){
        System.out.println("First commit to the branch");
    }

    @Test
    public void java11Test(){
        var list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        var chara = Character.toString(82);
//        var phoneNumber = new PhoneNumber("Jessica","050-52-254");
//        var a = phoneNumber.equals(new Object());
        list.stream().filter(s -> Integer.valueOf(s) > 4).collect(Collectors.toList());


    }

    @Test
    public void javaTest1(){
        List<String> list = new ArrayList<>();
        ArrayList<String> l = new ArrayList<>();
        list.add("a");
        list.add("ab");
        list.add("c");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        });

        Collections.sort(list,(o1,o2)->{
            var a = Integer.compare(o1.length(),o2.length());
            return a;
        });

        Collections.sort(list,comparingInt(String::length));

        list.sort(Comparator.comparingInt(String::length));

    }
    @Test
    public void abstractionTest(){
        Tiger tiger = new Tiger();
        Meat meat = new Meat();
        Grass grass = new Grass();
        tiger.eat(grass);
    }

    @Test
    public void test(){
        ArrayList<Object> cats = new ArrayList<>();
        cats.add("Томас");
        cats.add("Бегемот");
        cats.add("Филипп Маркович");
        cats.add("Пушок");

//        for (int i = 0; i < cats.size(); i++) {
//            if(cats.get(i).equals("Бегемот")){
//                cats.remove(cats.get(i));
//            }
//        }
        Iterator<Object> objI = cats.iterator();
        while (objI.hasNext()){
            Object o = objI.next();
            if(o.equals("Бегемот")){
                objI.remove();
            }
        }

        System.out.println(cats.toString());
        Logger log = Logger.getLogger(allTests.class.getName(),allTests.class.getName());
        log.getLevel();

    }

    @Test
    public void testBuilder(){
        Nutrients nutrients = new Nutrients.Builder()
                .setFat(3)
                .setCarbonates(5)
                .setProtein(4)
                .build();
        Nutrients nutrients1 = Nutrients.builder()
                .setProtein(5)
                .setSugar(10)
                .build();

        nutrients.equals(nutrients1);

    }

    @Test
    public void testMap() {
        Map<String, Integer> map = new HashMap<>();

        map.merge("test", 1, Integer::sum);
        map.merge("test", 1, Integer::sum);
        System.out.println(map);
    }

}
