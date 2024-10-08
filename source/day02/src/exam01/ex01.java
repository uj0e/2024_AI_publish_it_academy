package src.exam01;

public class ex01 {
    public static void main(String[] args) {

        char grade = 'F';
        String result = grade == 'F' ? "drop" : "pass";
        System.out.println(result);


/*        *//**
         * 단락 회로 평가
         * 논리 연산에서 이미 값이 결정된 경우 다음 항 연산 x
         *//*
        int num = 10;
        boolean result = num++ > 10 && (num = num + 20) > 20; // ++num : true
        System.out.println(result);
        System.out.println(num);
        num = 10;
        boolean result1 = num++ > 10 || (num = num + 20) > 20;
        System.out.println(result1);
        System.out.println(num);*/

/*        int num = 5;
        boolean result = num >= 10;
        boolean result1 = num < 100;
        boolean result2 = result && result1;
        boolean result3 = num >= 10 && num < 100;

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);*/

        /*int num = 10;
        num++;
        ++num;
        System.out.println(num);*/
    }
}
