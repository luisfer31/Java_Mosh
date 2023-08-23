package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0, "!");
        System.out.println(list);

        Collections.addAll(list, "d", "e", "f", "d");
        list.set(1, "a+");
        System.out.println(list);
        System.out.println(list.indexOf("e"));
        System.out.println(list.lastIndexOf("d"));
        System.out.println(list.subList(5,7));
    }
}
