package a9_palindrome;

public class PalindromeMosh {
    public boolean isPalindrome(String word) {
        if (word==null){
            return false;
        }
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left++) != word.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
