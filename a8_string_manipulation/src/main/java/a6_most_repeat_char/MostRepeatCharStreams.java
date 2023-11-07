package a6_most_repeat_char;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MostRepeatCharStreams {
    public static void main(String[] args) {
        String str = "Hellooo!!";
        System.out.println(mostRepeatChar(str));
    }

    public static char mostRepeatChar(String str) {
        Map<Character, Long> charCount = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return charCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(' ');
    }
}
