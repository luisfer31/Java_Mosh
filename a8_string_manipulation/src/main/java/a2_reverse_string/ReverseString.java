package a2_reverse_string;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String test = "Luis";
        reverseString(test);
    }

    public static void reverseString(String str) {
        String[] chain = str.split("");
        String[] chainReversed = new String[chain.length];
        int index = 0;
        for (int i = chain.length - 1; i >= 0; i--) {
            chainReversed[index] = chain[i];
            index++;
        }
        Arrays.stream(chain).forEach(System.out::print);
        System.out.println();
        Arrays.stream(chainReversed).forEach(System.out::print);
    }
}
