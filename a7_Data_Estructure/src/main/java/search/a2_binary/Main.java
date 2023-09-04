package search.a2_binary;

import search.a1_linear.LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] numbers ={1,3,5,6,7};
        BinarySearchItera search = new BinarySearchItera();
        int index = search.binarySearch(numbers, 70);
        System.out.println(index);
    }
}
