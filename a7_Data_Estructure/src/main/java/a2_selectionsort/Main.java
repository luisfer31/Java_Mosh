package a2_selectionsort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers ={7,3,1,5,2};
        var sorter = new SelectionSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
