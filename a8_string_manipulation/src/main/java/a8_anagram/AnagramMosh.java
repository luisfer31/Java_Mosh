package a8_anagram;

import java.util.Arrays;

public class AnagramMosh {
    public boolean anagram(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
        char[] array1 = str1.toLowerCase().toCharArray();
        Arrays.sort(array1);
        char[] array2 = str2.toLowerCase().toCharArray();
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }
}
