package a8_anagram;

import a7_firts_letter_capital.FirstLetterCapital;
import a7_firts_letter_capital.FirstLetterCapitalMosh;
import a7_firts_letter_capital.FirstLetterCapitalStream;

public class Main {
    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        AnagramMosh anagramMosh = new AnagramMosh();
        AnagramMosh2 anagramMosh2 = new AnagramMosh2();
        String str1 = "uiLS";
        String str2 = "Luis";
        anagram.anagram(str1,str2);
        System.out.println(anagramMosh.anagram(str1,str2));
        System.out.println(anagramMosh2.anagram(str1,str2));
    }
}
