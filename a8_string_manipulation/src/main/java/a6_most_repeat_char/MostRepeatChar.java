package a6_most_repeat_char;

import java.util.HashMap;

public class MostRepeatChar {
    public static void main(String[] args) {
        String str = "Hellooo!!";
        System.out.println(mostRepeatChar(str));
    }

    public static char mostRepeatChar(String str) {
        HashMap<Character, Integer> occurrences = new HashMap<>();
        char mostRepeatChar = ' ';
        int maxCount = 0;
        for (char ch : str.toCharArray()) {
            occurrences.put(ch, occurrences.getOrDefault(ch, 0) + 1);
            int count = occurrences.get(ch);
            if (count > maxCount) {
                maxCount = count;
                mostRepeatChar = ch;
            }
        }
        return mostRepeatChar;
    }
}
