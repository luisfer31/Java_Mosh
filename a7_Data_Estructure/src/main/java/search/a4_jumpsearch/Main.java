package search.a4_jumpsearch;

import search.a3_ternary.TernarySearch;

public class Main {
    public static void main(String[] args) {
        int[] numbers ={1,3,5,6,7};
        JumpSearch search = new JumpSearch();
        int index = search.jSearch(numbers, 7);
        System.out.println(index);
    }
}
