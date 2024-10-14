package exam01;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Q를 입력하면 종료 됩니다.");
            System.out.print("숫자1:");
            String _num1 = sc.nextLine();
            if (_num1.equalsIgnoreCase("Q")) {
                break;
            }
            try {
                int num1 = Integer.parseInt(_num1);
                System.out.print("연산기호:");
                char opr = sc.nextLine().toCharArray()[0];
                System.out.print("숫자2:");
                int num2 = Integer.parseInt(sc.nextLine());

                switch(opr) {
                    case '/': System.out.println(num1 / num2); break;
                    case '-': System.out.println(num1 - num2); break;
                    case '*': System.out.println(num1 * num2); break;
                    default:
                        System.out.println(num1 + num2);
                }
            } catch (Exception e) {
                System.out.println("숫자 형식이 아닙니다.");
            }
        }
    }
}
