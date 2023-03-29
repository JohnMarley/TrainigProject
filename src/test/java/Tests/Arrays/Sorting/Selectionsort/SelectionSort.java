package Tests.Arrays.Sorting.Selectionsort;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.ArrayUtils.swap;

//сортировка выыбором
public class SelectionSort {

    private int[] selectionSort(int[] array){
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }


    @Test
    public void test(){
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        selectionSort(array);
    }
}
