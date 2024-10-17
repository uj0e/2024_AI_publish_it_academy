package Game;

import java.util.List;
import java.io.*;
import java.util.Scanner;

public class FunC implements FunC_F{
    @Override
    public void MachineF() {
        Com com = new Com();
        PlayerF player = new Player();
        Scanner scanner = new Scanner(System.in);
        int Win = 0;
        while (true){
            int Exit;
            System.out.print("종료하려면 아무키나 입력하세요 : ");

            try {
                Exit = System.in.read();

                while (System.in.available() > 0){
                    System.in.read();
                }

                if (Exit == 10) {
                    int PlayBallCount;

                    try{
                        System.out.print("공의 개수를 입력하세요 : ");
                        String PlayBallNum = scanner.nextLine();
                        PlayBallCount = Integer.parseInt(PlayBallNum);
                    }catch (NumberFormatException e){
                        System.out.println("[Error] 잘못된 형식");
                        System.out.println("3개 이상, 9개 이하의 공만 준비할 수 있습니다.");
                        continue;
                    }

                    List<Integer> Goal = com.ComRandom(PlayBallCount);
                    System.out.println(Goal);
                    while (true) {
                        int Strike = 0;
                        int Boll = 0;
                        int Out = 0;
                        List<Integer> Answer = player.BallThrow(PlayBallCount);
                        for (int i = 0; i < Goal.size(); i++) {
                            for (int j = 0; j < Answer.size(); j++) {
                                if (i == j && Goal.get(i).equals(Answer.get(j))) Strike++;
                                else if (i != j && Goal.get(i).equals(Answer.get(j))) Boll++;
                                else Out = Goal.size() - (Strike + Boll);
                            }
                        }
                        if (Strike == Goal.size()) {
                            System.out.println("You Win");
                            Win++;
                            System.out.printf("%d회 승리\n", Win);
                            break;
                        }else {
                            System.out.printf("My answer %s\n", Answer);
                            System.out.printf("S : %d\nB : %d\nO : %d\n", Strike, Boll, Out);
                        }
                    }
                }
                else {
                    System.out.println("시스템을 종료합니다!");
                    break;
                }
            } catch (IOException e) {
                System.out.println("[Error]");
                e.printStackTrace();  // 예외에 대한 상세한 정보를 출력
                System.out.println("Reboot");
            }
        }

    }
}