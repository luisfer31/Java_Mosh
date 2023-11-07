package a7_firts_letter_capital;

public class FirstLetterCapitalMosh {
    public String capitalize(String str) {
        String[] firtsC = str.trim().split(" ");
        for (int i = 0; i < firtsC.length; i++) {
            firtsC[i] = firtsC[i].substring(0, 1).toUpperCase()
                    + firtsC[i].substring(1).toLowerCase();
        }
        return String.join(" ", firtsC);
    }
}
