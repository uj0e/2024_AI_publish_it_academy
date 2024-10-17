package exam01;

import java.time.LocalDate;

public class ex02 {
    public static void main(String[] args) {
        Customer c1 = new Customer(1000, "user", "user01@test.org");
        Customer c2 = new Customer(1000, "user", "user01@test.org");


        System.out.printf("c1 == c2 : 동일성 ? %s\n", c1 == c2);
        System.out.printf("c1.equals(c2) : 동등성 ? %s\n", c1.equals(c2));
        System.out.printf("c1 주소 ? %s\n", c1.toString());
    }
}
