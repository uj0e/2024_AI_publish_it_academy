package Game;

import java.util.List;
import java.util.Scanner;
import java.io.*;

public class FunC implements FunC_F{
    @Override
    public void MachineF() {
        Com com = new Com();
        PlayerF player = new Player();
        Scanner scanner = new Scanner(System.in);

        int Win = 0;
        while (true){
            String Exit;
            int Strike = 0;
            int Boll = 0;
            int Out = 0;
            System.out.print("종료하려면 아무 키나 입력하세요");

            try {
                Exit = String.valueOf(System.in.read());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            if (!Exit.isEmpty()){
                System.out.println("시스템을 종료합니다!");
                break;
            }
            else if (Exit.equals("\n") || Exit.trim().isEmpty()){
                List<Integer> Goal = com.ComRandom();
                System.out.println(Goal);
                while (true) {
                    List<Integer> Answer = player.BallThrow();
                    for (int i = 0; i < Goal.size(); i++) {
                        for (int j = 0; j < Answer.size(); j++) {
                            if (i == j && Goal.get(i).equals(Answer.get(j))) Strike++;
                            else if (i != j && Goal.get(i).equals(Answer.get(j))) Boll++;
                            else Out = 3 - Strike - Boll;
                        }
                    }
                    System.out.printf("S : %d\nB : %d\nO : %d", Strike, Boll, Out);
                    if (Strike == 3) {
                        System.out.println("You Win");
                        Win++;
                        break;
                    }
                }
            }
        }
    }
}