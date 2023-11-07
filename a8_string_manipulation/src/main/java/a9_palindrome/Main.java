package a9_palindrome;

import a8_anagram.Anagram;
import a8_anagram.AnagramMosh;
import a8_anagram.AnagramMosh2;

public class Main {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        PalindromeStream palindromeStream = new PalindromeStream();
        PalindromeMosh palindromeMosh = new PalindromeMosh();
        String word = "madam";
        System.out.println(palindrome.isPalindrome(word));
        System.out.println(palindromeStream.isPalindrome(word));
        System.out.println(palindromeMosh.isPalindrome(word));
    }
}
