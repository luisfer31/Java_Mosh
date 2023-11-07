package a9_palindrome;

public class PalindromeStream {
    public boolean isPalindrome(String word) {
        if (word==null){
            return false;
        }
        return new StringBuilder(word).reverse().toString().equals(word);
    }
}
