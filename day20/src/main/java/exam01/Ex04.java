package exam01;

import java.util.Random;

public class Ex04 {
    public static void main(String[] args) {
        Random random = new Random();

        int odd = random.ints().filter(s->s % 2 == 1).findFirst().orElse(0);
        System.out.println(odd);
    }
}
