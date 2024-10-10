package exam01;

import java.util.Scanner;

public class Calculating {

    public void calculating_machine() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("if you want exit, press 'E'");
            String exit = scanner.toString();
            if (exit.equalsIgnoreCase("E")) {
                System.out.println("exit");
                break;
            }

            System.out.println("입력");
            int num = scanner.nextInt();
            scanner.nextLine();
            System.out.println("기호 입력");
            String cal = scanner.nextLine();
            System.out.println("입력");
            int num1 = scanner.nextInt();
            scanner.nextLine();

            switch (cal) {
                case "+":
                    System.out.printf("result : %d", num + num1);
                    break;
                case "-":
                    System.out.printf("result : %d", num - num1);
                    break;
                case "*":
                    System.out.printf("result : %d", num * num1);
                    break;
                case "/":
                    if (num1 != 0) System.out.printf("result : %d", num / num1);
                    else System.out.println("0으로 나눌 수 없음");
                    break;
                case "%":
                    System.out.printf("result : %d", num % num1);
                    break;
                case "**":
                case "^":
                    System.out.printf("result : %d", (int) Math.pow(num, num1));
                    break;
                default:
                    System.out.println("error retry");
                    break;
                }
        }
        scanner.close();
    }
}
