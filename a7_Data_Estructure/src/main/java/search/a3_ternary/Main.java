package search.a3_ternary;

import search.a2_binary.BinarySearchItera;

public class Main {
    public static void main(String[] args) {
        int[] numbers ={1,3,5,6,7};
        TernarySearch search = new TernarySearch();
        int index = search.tSearch(numbers, 7);
        System.out.println(index);
    }
}
