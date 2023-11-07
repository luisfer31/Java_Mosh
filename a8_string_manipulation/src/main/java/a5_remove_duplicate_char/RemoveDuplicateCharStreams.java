package a5_remove_duplicate_char;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateCharStreams {
    public static void main(String[] args) {
        String str = "Hellooo!!";
        System.out.println(removeDuplicateChar(str));
    }

    public static String removeDuplicateChar(String str) {
        if (str == null) {
            return "";
        }
        return str.chars().distinct()
                .mapToObj(c->String.valueOf((char)c))
                .collect(Collectors.joining());
    }
}
