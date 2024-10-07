package exam01;

public class Ex01 {
    /**
     * 설명 전용 주석
     * @param args
     */
    public static void main(String[] args){
/*
        int num1; // 변수 선언 - 메모리(공간)할당
        num1 = 10; // 초기화, 대입 연산자
        System.out.println(num1);
        long num2 = 10000000000L;
        byte num3 = 10; // int형으로 변환 (작업 2회 진행)
        int num4 = num3;
        int num5 = 1000000000;
        float num6 = num5;
        long num7 = 10000000000L;
        float num8 = num7;
*/

        // byte(1) -> short(2) / char(3~4) -> int(4) -> long(8) -> float(4) -> double(8)

/*        int num = 10;
        double num1 = 3.0;
        double result = num / num1;
        System.out.println(result);*/

        int num = 1000;
        byte num1 = (byte)num; //명시적 형변환
        System.out.println(num1); // -24

    }
}
