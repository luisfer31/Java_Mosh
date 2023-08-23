package generics;

import generics.GenericList;
import generics.Instructor;
import generics.User;
import generics.Utils;

public class Main {
    public static void main(String[] args) {
//        var list = new GenericList<User>();
//        GenericList<Integer> numbers = new GenericList<>();
//        numbers.add(1); // Boxing
//        int number = numbers.get(0); // Unboxing

        var user1 = new User(10);
        var user2 = new User(20);
        if (user1.compareTo(user2) < 0)
            System.out.println("user1 < user2");
        else if (user1.compareTo(user2) == 0)
            System.out.println("user1 == user2");
        else
            System.out.println("user1 > user2");


        var max = Utils.max(1, 3);
        System.out.println(max);

        var max1 = Utils.max(new User(25), new User(20));
        System.out.println(max1);

        System.out.println();
        Utils.print(1,"Luis");

        System.out.println();

        User user = new Instructor(10);
        Utils.printUser(new Instructor(10));

        var instructors = new GenericList<Instructor>();
        var users = new GenericList<User>();
        Utils.printUsers(users);
    }
}
