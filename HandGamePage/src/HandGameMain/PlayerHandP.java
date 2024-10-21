package HandGameMain;

import java.util.Scanner;

public class PlayerHandP implements Hand {
    Scanner scanner = new Scanner(System.in);
    int playerHandCount;

    public String PlayerHandP(){

        while (true){
            System.out.print("가위 바위 보 입력 : ");
            String playerHandCountS = scanner.nextLine();
            switch (playerHandCountS){
                case "0":
                case "s":
                    playerHandCount = 0;
                    break;
                case "1":
                case "r":
                    playerHandCount = 1;
                    break;
                case "2":
                case "p":
                    playerHandCount = 2;
                    break;
                default:
                    System.out.println("오류 다시 입력");
                    continue;
            }
            break;
        }
        String playerHand = hand[playerHandCount];
        return playerHand;
    }

}
