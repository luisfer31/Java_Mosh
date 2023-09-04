package sort.a6_countingsort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {7, 3, 5, 3, 3, 1, 5, 8};
        var sorter = new CountingSort();
        sorter.sort(numbers, 8);
        System.out.println(Arrays.toString(numbers));
    }
}
