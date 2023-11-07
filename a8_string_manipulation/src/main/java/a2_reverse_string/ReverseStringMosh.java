package a2_reverse_string;

import java.util.Arrays;

public class ReverseStringMosh {
    public static void main(String[] args) {
        String test = "Luis";
        reverseString(test);
    }

    public static void reverseString(String str) {
        if (str==null){
            return;
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed.append(str.charAt(i));
        }
        System.out.println(str);
        System.out.println(reversed.toString());
    }
}
