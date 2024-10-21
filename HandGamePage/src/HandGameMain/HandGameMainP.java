package HandGameMain;

public class HandGameMainP {
    public static void PlayHandGame(){

        int w_Count = 0;
        int Count = 0;
        while (true) {
            PlayerHandP playerHandP = new PlayerHandP();
            ComHandP comHandP = new ComHandP();

            int com = comHandP.comHandCount;

            System.out.println("플레이어 : " + playerHandP.PlayerHandP());
            System.out.println("컴퓨터 : " + comHandP.ComHandP());

            int player = playerHandP.playerHandCount;

            if (Count == 0 && com == player){ // 가위바위보
                System.out.println("무승부! 다시해!!");
                continue;
            }
            else if(Count == 0 && com != player){
                switch (player){
                    case 0:
                        Count = 1;
                        if (com == 1) w_Count = - 1;
                        else if (com == 2) w_Count = 1;
                        continue;
                    case 1:
                        Count = 1;
                        if (com == 0) w_Count = 1;
                        else if (com == 2) w_Count = -1;
                        continue;
                    case 2:
                        Count = 1;
                        if (com == 0) w_Count = -1;
                        else if (com == 1) w_Count = 1;
                        continue;
                }
            }

            else if (Count == 1){ // 묵찌빠
                if (w_Count == 1){
                    switch (player){
                        case 0:
                            if (com == 0) w_Count = 2;
                            else if (com == 1) w_Count = -1;
                            else if (com == 2) w_Count = 1;
                            break;
                        case 1:
                            if (com == 1) w_Count = 2;
                            else if (com == 2) w_Count = -1;
                            else if (com == 0) w_Count = 1;
                            break;
                        case 2:
                            if (com == 2) w_Count = 2;
                            else if (com == 0) w_Count = -1;
                            else if (com == 1) w_Count = 1;
                            break;
                    }
                }
                else if (w_Count == -1){
                    switch (player){
                        case 0:
                            if (com == 0) w_Count = -2;
                            else if (com == 1) w_Count = -1;
                            else if (com == 2) w_Count = 1;
                            break;
                        case 1:
                            if (com == 1) w_Count = -2;
                            else if (com == 2) w_Count = -1;
                            else if (com == 0) w_Count = 1;
                            break;
                        case 2:
                            if (com == 2) w_Count = -2;
                            else if (com == 0) w_Count = -1;
                            else if (com == 1) w_Count = 1;
                            break;
                    }
                }
            }
            if (w_Count == 2){
                System.out.println("승리!!!!!!!!!!!!!!!");
                break;
            }else if (w_Count == -2){
                System.out.println("패배!!!!!!!!!!!!!!!");
                break;
            }

        }
    }

    public static void main(String[] args) {
        PlayHandGame();
    }
}
