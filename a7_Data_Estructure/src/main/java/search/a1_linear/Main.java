package search.a1_linear;

public class Main {
    public static void main(String[] args) {
        int[] numbers ={7,1,3,6,5};
        LinearSearch search = new LinearSearch();
        int index = search.linearSearch(numbers, 8);
        System.out.println(index);
    }
}
