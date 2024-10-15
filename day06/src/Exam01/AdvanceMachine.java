package Exam01;

public class AdvanceMachine extends Machine{
    @Override
    public int add(int num, int num1){
        return calculator.add(num, num1);
    }
    @Override
    public int sub(int num, int num1){
        return calculator.sub(num, num1);
    }
    @Override
    public int mul(int num, int num1){
        return calculator.mul(num, num1);
    }
    @Override
    public int div(int num, int num1){
        return calculator.div(num, num1);
    }

}
