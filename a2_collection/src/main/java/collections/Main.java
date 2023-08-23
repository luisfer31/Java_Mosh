package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CollectionsDemo.show();
        ListDemo.show();
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("b", "e3"));
        customers.add(new Customer("a", "e2"));
        customers.add(new Customer("c", "e1"));

        System.out.println();
        Collections.sort(customers);
        System.out.println(customers);

        Collections.sort(customers,new EmailComparator());
        System.out.println(customers);
        QueueDemo.show();

        System.out.println();
        SetDemo.show();
        SetDemo.show1();
        SetDemo.show2();

        System.out.println();

        MapDemo.show();
    }
}
