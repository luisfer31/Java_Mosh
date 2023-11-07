package a5_remove_duplicate_char;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String str = "Hellooo!!";
        System.out.println(removeDuplicateChar(str));
    }

    public static String removeDuplicateChar(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                output.append(ch);
            }
        }
        return output.toString();
    }
}
