package a8_anagram;

import java.util.Arrays;

public class Anagram {
    public void anagram(String str1, String str2){
        if ((str1==null||str2==null)||str1.length()!=str2.length()){
            System.out.println("false");
            return;
        }
        String[] strArray1 = str1.toLowerCase().split("");
        String[] strArray2 = str2.toLowerCase().split("");
        Arrays.stream(strArray1).sorted();
        Arrays.stream(strArray2).sorted();
        boolean isAnagram = false;
        for (int i = 0; i < strArray1.length; i++) {
            if (strArray1[i].equals(strArray2[i])){
                isAnagram=true;
            }else {
                isAnagram=false;
            }
        }
        System.out.println(isAnagram);
    }
}
