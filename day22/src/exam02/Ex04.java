package exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Ex04 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("obj2.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            Map<String, Object> data = new HashMap<>();

            Person p1 = new Person("user1", 40);
            Person p2 = new Person("user2", 45);
            Person p3 = new Person("user3", 27);

            data.put("p1", p1);
            data.put("p2", p2);
            data.put("p3", p3);

            data.put("message", "Hello!");

            oos.writeObject(data);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
