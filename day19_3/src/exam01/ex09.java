package exam01;

import java.util.List;
import java.util.stream.Stream;

public class ex09 {
    public static void main(String[] args) {
        List<String> heart = Stream.generate(()->"♥").limit(10).toList();
        System.out.println(heart);
    }
}
