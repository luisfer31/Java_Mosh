package a1_count_vowels;

import java.util.Arrays;
import java.util.Scanner;

public class CountVowels {
    static String vowels = "a,e,i,o,u";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chain = sc.nextLine().toLowerCase();
        System.out.println(countVowels(chain));

    }

//    public static int countVowels(String chain){
//        String[] str = chain.split("");
//        int count =0;
//        for (int i = 0; i <str.length ; i++) {
//            if (str[i].equals("a")||str[i].equals("e")||str[i].equals("i")||str[i].equals("o")||str[i].equals("u")){
//                count +=1;
//            }
//        }
//        return count;
//    }

//    public static int countVowels(String chain) {
//        int count = (int) Arrays.stream(chain.toLowerCase().split(""))
//                .filter(ch -> ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u"))
//                .count();
//        return count;
//    }

    public static int countVowels(String chain) {
        int count = 0;
        for (char ch : chain.toLowerCase().toCharArray()) {
            if (vowels.contains(Character.toString(ch))) {
                count += 1;
            }
        }
        return count;
    }
}
