package a4_rotate;

public class Rotate {
    public static void main(String[] args) {
        boolean rotation = areRotations("ABCD", "DABC");
        System.out.println(rotation);

    }

    public static boolean areRotations(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        return (str1.length() == str2.length() &&
                (str1 + str2).contains(str2));
    }
}
