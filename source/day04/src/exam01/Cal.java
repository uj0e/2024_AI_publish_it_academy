package exam01;

import java.util.Scanner;

public class Cal {
    Scanner scanner = new Scanner(System.in);
    public void machine(){
        while (true){
            System.out.println("Q를 입력하면 종료");
            String exit = scanner.nextLine();
            if (exit.equalsIgnoreCase("Q")) break;
        }
        scanner.close();
    }
}
