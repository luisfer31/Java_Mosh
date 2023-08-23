package generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second) < 0) ? second : first;
    }

    public static <K, V> void print(K key, V value) {
        System.out.println(key + "=" + value);
    }

    public static void printUser(User user) {
        System.out.println(user);
    }

    public static void printUsers(GenericList<? super User> users) {
        GenericList<Object> temp = new GenericList<>();
        users.add(new User(1));

        Object x = users.get(0);

    }
}
