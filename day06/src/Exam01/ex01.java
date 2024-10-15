package Exam01;

import java.util.Arrays;

public class ex01 {
    public static void main(String[] args) {
        Animal[] animals = {new Tiger(), new Bird(), new Human()};
        Animal animal1 = new Animal();
        animal1.move();
        for (Animal animal : animals){
            if (animal instanceof Tiger tiger) tiger.move();
            else if (animal instanceof Bird bird) bird.move();
            else if (animal instanceof Human human) human.move();
        }

        /*Animal[] animals = {new Tiger(), new Bird()};
        for (Animal animal : animals){ // 업 캐스팅
            animal.move();
            Tiger tiger = (Tiger) animal; // 다운 캐스팅
            tiger.move();
        }*/
    }
}
