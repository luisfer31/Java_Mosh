package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        for (String item:collection){
            System.out.println(item);
        }

        Collections.addAll(collection,"d","e","f");
        System.out.println(collection);

        collection.remove("a");
        System.out.println(collection);

        boolean ask = collection.contains("a");
        System.out.println(ask);

        Object[] array = collection.toArray();
        System.out.println(Arrays.toString(array));

        String[] strings = collection.toArray(new String[0]);

        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        System.out.println(collection.equals(other));


    }
}
