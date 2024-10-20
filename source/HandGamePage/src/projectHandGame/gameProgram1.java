package projectHandGame;

import java.util.Scanner;

public class gameProgram1 extends trance {
    public static String gameProgram1(){ //묵에 묵에 뭐!
        Scanner scanner = new Scanner(System.in);
        String[] hand = {"가위", "바위", "보"};
        while (true){
            System.out.print("뭐 낼래? : ");
            String user = scanner.next();
            int user_int = trance(user);

            if (user_int == 9999){
                System.out.println("다시 입력해주세요!");
                continue;
            }else if(user_int < 3){
                int rancom = (int)(Math.random() * 3);

                String com = hand[rancom];
                String player = hand[user_int];

                System.out.println("컴퓨터 : " + com);
                System.out.println("플레이어 : " + player);
                if (player == com){
                    return "승리";
                }
                else if (!(player == com)){
                    continue;
                }
            }
        }
    }
}
