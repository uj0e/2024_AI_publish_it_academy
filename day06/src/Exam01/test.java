package Exam01;

class People<T,M>{
    private T name;
    private M age;

    People(T name, M age){
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }
    public void setName(T name) {
        this.name = name;
    }
    public M getAge() {
        return age;
    }
    public void setAge(M age) {
        this.age = age;
    }

    //Generic Mothod
    public static<T,V> boolean compare(People<T,V>p1, People<T,V>p2) {
        boolean nameCompare = p1.getName().equals(p2.getName());
        boolean ageCompare =p1.getAge().equals(p2.getAge());
        return nameCompare && ageCompare;
    }
}

public class test {
    public static void main(String []args){
        //타입 파라미터 지정
        People<String,Integer> p1 = new People<String,Integer>("Jack",20);
        //타입 파라미터 추정
        People<String,Integer> p2 = new People("Steve",30);
        //GenericMothod 호출
        boolean result = p1.compare(p1,p2);
        System.out.println(result);
    }
}
