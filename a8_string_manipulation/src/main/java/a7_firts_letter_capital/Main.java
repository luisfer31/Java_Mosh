package a7_firts_letter_capital;

public class Main {
    public static void main(String[] args) {
        FirstLetterCapital firtsLetter = new FirstLetterCapital();
        FirstLetterCapitalMosh capitalize = new FirstLetterCapitalMosh();
        FirstLetterCapitalStream capStream = new FirstLetterCapitalStream();
        String str = "luis fernando munoz c";
        firtsLetter.firsLetterC(str);
        System.out.println();
        System.out.println(capitalize.capitalize(str));
        System.out.println(capStream.firsLetterC(str));
    }
}
