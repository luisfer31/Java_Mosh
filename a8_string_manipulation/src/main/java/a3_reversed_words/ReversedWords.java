package a3_reversed_words;

import java.util.Arrays;

public class ReversedWords {
    public static void main(String[] args) {
        String test = "Luis Fernando Munoz Calvache";
        System.out.println(test);
        System.out.println(reversedWords(test));
    }

    public static String reversedWords(String str){
        String[] words = str.split(" ");
        String[] reversedSentence = new String[words.length];
        int index = 0;
        for (int i = words.length-1; i >=0 ; i--) {
            reversedSentence[index] = words[i];
            index++;
        }
        return Arrays.toString(reversedSentence);
    }
}
