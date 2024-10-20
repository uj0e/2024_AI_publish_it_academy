package projectHandGame;

import java.util.Scanner;

import static projectHandGame.gameProgram1.gameProgram1;

public class gameProgram2 extends trance {
    static void gameProgram2(){ //가위바위보!
        int winCount = 0;
        int countHand = 0;
        int loseCount = 0;
        gameProgram1 gameProgram1 = new gameProgram1();
        Scanner scanner = new Scanner(System.in);
        String[] hand = {"가위", "바위", "보"};
        System.out.println("게임 시작!!!");

        while (true){
            System.out.print("뭐 낼래? : ");
            String user = scanner.next();
            int user_int = trance(user);

            if (user_int == 4){
                System.out.println("프로그램을 종료합니다!");
                break;
            }else if (user_int == 3){
                System.out.print("'종료'를 입력하면 종료합니다\n설명보기 : '설명'\n");
                continue;
            }
            else if (user_int == 9999){
                System.out.println("다시 입력해주세요!");
                continue;
            }else if(user_int < 3){
                int rancom = (int)(Math.random() * 3);

                String com = hand[rancom];
                String player = hand[user_int];

                System.out.println("컴퓨터 : " + com);
                System.out.println("플레이어 : " + player);
                if (com == player){
                    System.out.println("무승부");
                    continue;
                } else if (!(com == player)) {
                    if (com.equals("가위")){
                        if (player.equals("바위")){
                            countHand = 1;
                            gameProgram1();
                            winCount++;
                            System.out.printf("%d승 %d무 %d패\n",winCount, loseCount);
                        }else if (player.equals("보")){
                            System.out.println("패배");
                            loseCount++;
                            System.out.printf("%d승 %d무 %d패\n",winCount, loseCount);
                        }
                    }
                    else if (com.equals("바위")){
                        if (player.equals("보")){
                            System.out.println("승리");
                            winCount++;
                            System.out.printf("%d승 %d무 %d패\n",winCount, loseCount);
                        }else if (player.equals("가위")){
                            System.out.println("패배");
                            loseCount++;
                            System.out.printf("%d승 %d무 %d패\n",winCount, loseCount);
                        }
                    }
                    else if (com.equals("보")){
                        if (player.equals("가위")){
                            System.out.println("승리");
                            winCount++;
                            System.out.printf("%d승 %d무 %d패\n",winCount, loseCount);
                        }else if (player.equals("바위")){
                            System.out.println("패배");
                            loseCount++;
                            System.out.printf("%d승 %d무 %d패\n",winCount, loseCount);
                        }
                    }
                }
            }
        }
    }
}
