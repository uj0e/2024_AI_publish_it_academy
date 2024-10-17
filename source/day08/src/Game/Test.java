package Game;

import java.awt.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Test implements TestF{
    @Override
    public String[] BallThrow() {
        Scanner scanner = new Scanner(System.in);

        String[] Ball = new String[3];

        int NumBall = 0;
        do {
            System.out.printf("%d번째 숫자 입력 : ", NumBall + 1);
            Ball[NumBall] = scanner.next();
            if (NumBall - 1 >= 0 && Objects.equals(Ball[NumBall], Ball[NumBall - 1])) {
                System.out.println("중복된 숫자는 적을 수 없습니다!");
                continue;
            }else if (Ball[NumBall].equals("0")){
                System.out.println("0은 입력할 수 없습니다!");
                continue;
            }
            NumBall++;
        }while (NumBall < 3);
        return Ball;
//        System.out.println(Arrays.toString(Ball));
    }
}
