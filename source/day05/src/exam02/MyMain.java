package exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MyMain {
    public static void main(String[] args) {
        List<Integer> arr = new Vector<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        arr.add(2,100);
        System.out.println(arr);
    }

}
