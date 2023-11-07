package a2_reverse_string;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseStringStreams {
    public static void main(String[] args) {
        String test = "Luis";
        reverseString(test);
    }

    public static void reverseString(String str) {
        String strReversed = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                    Collections.reverse(list);
                    return list.stream();
                }))
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + strReversed);
    }
}
