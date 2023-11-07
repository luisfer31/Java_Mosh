package a7_firts_letter_capital;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FirstLetterCapitalStream {
    public String firsLetterC(String str) {
        return Arrays.stream(str.trim().split(" "))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }
}
