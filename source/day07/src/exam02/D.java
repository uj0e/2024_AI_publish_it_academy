package exam02;

public class D implements C {
    @Override
    public void common() {
        methodA();
        System.out.println("Common 호출");
    }

    @Override
    public void methodA() {
        System.out.print("methodA 호출 / ");
    }

    @Override
    public void methodB() {
        System.out.print("methodB 호출 / ");
    }

    @Override
    public void methodC() {
        System.out.print("methodC 호출 / ");
    }
}
