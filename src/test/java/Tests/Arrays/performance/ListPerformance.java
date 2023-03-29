package Tests.Arrays.performance;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ListPerformance {

    @Test
    public void arrayTest(){

        int[] array = new int[10];
//        String[] arrayS = new String[10];
//        Object[] arrObj = new Object[10];
//        String[] arrStr = new String[10];
        long startFillingArray = new Date().getTime();
        List<Integer> arraylist = new ArrayList<>();
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
        System.out.println("ArrayList Filling by 50M elements, ms: "+arrayResult);
        System.out.println("LinkedList Filling by 50M elements, ms: "+linkedResult);

        List<Integer>subArrayList=new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            subArrayList.add(i);
        }
        long startArrayInserting = new Date().getTime();
        arraylist.addAll(25000000,subArrayList);
        long endArrayInserting = new Date().getTime();
        long resultArrayInserting = endArrayInserting-startArrayInserting;

        System.out.println("ArrayList inserting 100 elements into middle of array, ms:"+resultArrayInserting);

        List<Integer>subLinkedList=new LinkedList<>();
        for (int i = 0; i <100 ; i++) {
            subLinkedList.add(i);
        }
        long startinkedInserting = new Date().getTime();
        linkedList.addAll(25000000,subLinkedList);
        long endLinkedInserting = new Date().getTime();
        long resultLinkedInserting = endLinkedInserting-startinkedInserting;
        System.out.println("LinkedList  inserting 100 elements into middle of array, ms:"+resultLinkedInserting);

        long start = new Date().getTime();
        arraylist.get(25000000);
        long end = new Date().getTime();
        long res = end-start;
        System.out.println("ArrayList get central element, ms:"+res);
        start = new Date().getTime();
        linkedList.get(25000000);
        end = new Date().getTime();
        res = end-start;
        System.out.println("LinkedList get central element, ms:"+res);

    }
}
