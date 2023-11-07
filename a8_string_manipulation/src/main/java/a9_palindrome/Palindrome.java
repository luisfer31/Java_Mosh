package a9_palindrome;

public class Palindrome {
    public boolean isPalindrome(String word) {
        if (word==null){
            return false;
        }
        StringBuilder input = new StringBuilder(word);
        input.reverse();
        return input.toString().equals(word);
    }
}
