package a8_anagram;

import java.util.Arrays;

public class AnagramMosh2 {
    public boolean anagram(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
        return Arrays.equals(str1.toLowerCase().chars().sorted().toArray(),
                str2.toLowerCase().chars().sorted().toArray());
    }
}
