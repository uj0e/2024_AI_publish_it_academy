package Game;

import java.util.*;

public class Player implements PlayerF{
    @Override
    public List<Integer> BallThrow(int PlayBallCount) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> Ball = new ArrayList<>();

        int NumBall = 0;
        do {
            System.out.printf("%d번째 숫자 입력 : ", NumBall + 1);
            try{
                String Balls = scanner.nextLine(); // 문자열로 입력받기
                Integer num = Integer.valueOf(Balls); // Integer형 변환
                Ball.add(num); // List형 Ball에 값 대입
            }catch (NumberFormatException e){ // 형식이 다를 때 오류처리
                System.out.println("[Error] 잘못된 입력!!!!");
                continue; // 값 재입력시도
            }

            if (NumBall - 1 >= 0 && Ball.get(NumBall).equals(Ball.get(NumBall -1)) ||
                    NumBall - 2 >= 0 && Ball.get(NumBall).equals(Ball.get(NumBall -2))) {
                System.out.println("중복된 숫자는 적을 수 없습니다!");
                Ball.remove(NumBall);
                continue;
            } else if (Ball.get(0).equals(0)) {
                System.out.println("첫번째 자리에 0은 입력할 수 없습니다!");
                Ball.remove(NumBall);
                continue;
            } else if (Ball.get(NumBall) >= 10){
                System.out.println("9보다 큰 수는 입력할 수 없습니다!");
                Ball.remove(NumBall);
                continue;
            } else if (Ball.get(NumBall) < 0) {
                System.out.println("음수는 입력할 수 없습니다!");
                Ball.remove(NumBall);
                continue;
            }
            NumBall++;
        }while (NumBall < PlayBallCount);

        return Ball;
    }
}
