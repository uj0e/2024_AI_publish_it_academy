package exam01;

public interface Buyer {
    int num = 0;
    void buy();
    default void order(){
        System.out.println("구매해");
        privateMethod();
    }
    private void privateMethod(){
        System.out.println("private Method");
    }
    static void staticMethod(){
        System.out.println("static Method");
    }
}
