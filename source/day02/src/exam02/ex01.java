package src.exam02;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {


        int total = 0;
        for (int i = 0; i <= 100; ++i){
            /*if(i % 2 == 0) total += i;
            else continue;*/
            if(i % 2 == 0) continue;
            else total += i;
        }
        System.out.println(total);

/*        int total = 0;
        for(int i = 1; i <= 10; ++i){
            total += i;
            System.out.println(i);
            if (total >= 8) continue;
            System.out.println("hello");
            if (i == 5) break;
        }
        System.out.println(total);*/

/*
        int total = 0;
        for (int i = 0, j = 10; i <= 100; ++i, j--){
            total += i;
            System.out.println(j);
        }
        System.out.println(total);
*/

        /**
         * do while : 최소 1회 실행
         */
/*        int num = 1, total = 0;
        do {
            total += num;
            ++num;
        }while (num <= 100);

        System.out.println(total);*/

/*        int num = 1, total = 0;
        while (num <= 100){
            total += num;
            ++num;
        }
        System.out.println(total);*/

/*        int rank = 4;
        switch (rank){
            case 1:
                System.out.println("gold");
                break;
            case 2:
                System.out.println("silver");
                break;
            case 3:
                System.out.println("bronze");
                break;
            default:
                System.out.println("순위권 외");
        }*/

/*        int num = 15;
        if(num == 10){
            System.out.println("10 입니다");
        }else {
            System.out.println("10이 아닙니다");
        }

        String result = num == 10 ? "10 입니다" : "10이 아닙니다";
        System.out.println(result);*/

        /*int age1 = 16;
        Scanner in = new Scanner(System.in);
        System.out.println("정수 입력");
        int age = in.nextInt();

        if(age < 8) System.out.println("유치원");
        else if (age < 14) System.out.println("초등학교");
        else if (age < 17) System.out.println("중학교");
        else if (age < 20) System.out.println("고등학교");
        else System.out.println("성인");*/
    }
}
