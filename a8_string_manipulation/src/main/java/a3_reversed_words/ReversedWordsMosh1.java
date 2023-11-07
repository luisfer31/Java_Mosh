package a3_reversed_words;

import java.util.Arrays;
import java.util.Collections;

public class ReversedWordsMosh1 {
    public static void main(String[] args) {
        String test = "Luis Fernando Munoz Calvache";
        System.out.println(test);
        System.out.println("'"+reversedWords(test)+"'");
    }

    public static String reversedWords(String str) {
        if (str==null){
            return "";
        }
        String[] words = str.trim().split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}
