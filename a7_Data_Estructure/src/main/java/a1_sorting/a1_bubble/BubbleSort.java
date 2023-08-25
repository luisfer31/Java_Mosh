package a1_sorting.a1_bubble;

import java.util.Arrays;

public class BubbleSort {


    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                }
            }
        }
        Arrays.stream(array).forEach(item -> System.out.print(item + " "));
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


}
