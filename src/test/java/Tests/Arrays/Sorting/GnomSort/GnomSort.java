package Tests.Arrays.Sorting.GnomSort;

import org.junit.Test;

import java.util.Arrays;

import static org.apache.commons.lang3.ArrayUtils.swap;

public class GnomSort {
    /**
     *  Это метод, которым садовый гном сортирует линию цветочных горшков.
     *  По существу он смотрит на следующий и предыдущий садовые горшки:
     *  если они в правильном порядке, он шагает на один горшок вперёд,
     *  иначе он меняет их местами и шагает на один горшок назад.
     *  Граничные условия: если нет предыдущего горшка,
     *  он шагает вперёд; если нет следующего горшка, он закончил.
     * @param array
     * @return
     */
    private int[] gnomSort(int[]array){
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                break;
            }

            if(array[i+1]<array[i]){
                swap(array,i+1,i);
                if(i!=0){
                    i-=2;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    @Test
    public void test(){
        int[] array = {10, 2, 10, 3, 1, 2, 5, 12, 0, 35, 36, 34, 18, 0};
        gnomSort(array);
    }
}
