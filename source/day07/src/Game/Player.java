package Game;

import java.util.*;

public class Player implements PlayerF{
    @Override
    public List<Integer> BallThrow() {
        Scanner scanner = new Scanner(System.in);

        List<Integer> Ball = new ArrayList<>();

        int NumBall = 0;
        do {
            System.out.printf("%d번째 숫자 입력 : ", NumBall + 1);
            Ball.add(scanner.nextInt());
            if (NumBall - 1 >= 0 && Ball.get(NumBall).equals(Ball.get(NumBall -1)) ||
                    NumBall - 2 >= 0 && Ball.get(NumBall).equals(Ball.get(NumBall -2))) {
                System.out.println("중복된 숫자는 적을 수 없습니다!");
                Ball.remove(NumBall);
                continue;
            } else if (Ball.get(NumBall).equals(0)) {
                System.out.println("0은 입력할 수 없습니다!");
                Ball.remove(NumBall);
                continue;
            }else if (Ball.get(NumBall) >= 10){
                System.out.println("9보다 큰 수는 입력할 수 없습니다!");
                Ball.remove(NumBall);
                continue;
            }
            NumBall++;
        }while (NumBall < 3);

        return Ball;
    }
}
