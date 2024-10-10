package exam01;

public class Student {
    int id;
    String name;
    String major;

    void study(){
        System.out.printf("이름 : %s\n학번 : %d\n전공 : %s\n", name, id, major);
    }

}
