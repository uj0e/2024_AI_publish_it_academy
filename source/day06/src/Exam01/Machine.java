package Exam01;

public abstract class Machine extends Calculator {
    Calculator calculator = new Calculator() {
        @Override
        public int add(int num, int num1) {
            return num + num1;
        }

        @Override
        public int sub(int num, int num1) {
            return num - num1;
        }
        @Override
        public int mul(int num, int num1) {
            return num * num1;
        }
        @Override
        public int div(int num, int num1) {
            if (num1 != 0){
                return num / num1;
            }else System.out.println("0으로 나눌 수 없습니다");
            return num;
        }
    };
}
