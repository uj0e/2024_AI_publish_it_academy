package exam01;

import java.util.HashSet;
import java.util.Set;

public class ex03 {
    public static void main(String[] args) {

        Set<String> items = new HashSet<>();
        items.add(new String("ABC"));
        items.add(new String("ABC"));
        items.add("ABC");
        items.add("DEF");
        items.add("GHI");
        System.out.println(items);
        /*Customer2 c2 = new Customer2("user", 1000, "user01@test.org");
        System.out.printf("name = %s, id = %d email = %s\n", c2.name(), c2.id(), c2.email());
        System.out.println(c2);*/
    }
}
