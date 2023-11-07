package a7_firts_letter_capital;

public class FirstLetterCapital {
    public void firsLetterC(String str){
        String[] firtsC = str.trim().split(" ");
        String chain ="";
        String string="";
        for (int i = 0; i < firtsC.length; i++) {
            chain = firtsC[i];
            string = chain.toUpperCase().charAt(0)+chain.substring(1);
            System.out.print(string +" ");
        }
    }
}
