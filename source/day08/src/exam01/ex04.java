package exam01;

import java.util.HashSet;
import java.util.Set;

public class ex04 {
    public static void main(String[] args) {
        Set<Customer> items = new HashSet<>();
        items.add(new Customer(1000, "user", "user01@test.org"));
        items.add(new Customer(1000, "user", "user01@test.org"));
        items.add(new Customer(1000, "user", "user01@test.org"));
        items.add(new Customer(1000, "user2", "user02@test.org"));
        items.add(new Customer(1000, "user3", "user03@test.org"));

        for (Customer item : items){
            System.out.println(item);
        }
    }
}
