package a3_reversed_words;

import java.util.Arrays;

public class ReversedWordsMosh {
    public static void main(String[] args) {
        String test = "Luis Fernando Munoz Calvache";
        System.out.println(test);
        System.out.println(reversedWords(test));
    }

    public static String reversedWords(String str){
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length-1; i >=0 ; i--) {
            reversed.append(words[i]+" ");
        }
        return reversed.toString().trim();
    }
}
