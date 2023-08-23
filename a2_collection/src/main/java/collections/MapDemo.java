package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void show(){
        /*List<Customer> customers = new ArrayList<>();
        // O(n) 1'000.000 of customers
        for (var customer:customers){
            if (customer.getEmail()=="e1"){
                System.out.println("Found!");
            }
        }*/

        var c1 = new Customer("a","e1");
        var c2 = new Customer("b","e2");

        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        var unknown = new Customer("Unknown","");
        var customer = map.get("e10");
        System.out.println(customer);

        var customerU = map.getOrDefault("e10",unknown);
        System.out.println(customerU);

        var exist = map.containsKey("e10");
        System.out.println(exist);

        map.replace("e1",new Customer("a++","e1"));
        System.out.println(map);

        System.out.println();
        for (var key:map.keySet()){
            System.out.println(key + " " + map.get(key));
        }

        System.out.println();
        for (var entry:map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println();
        for (var custom:map.values()){
            System.out.println(custom);
        }
    }
}
