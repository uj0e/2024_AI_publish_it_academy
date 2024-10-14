package projectHandGame;


import java.util.Scanner;

public class MainProgram {

    static void gameOn(){// 게임 시작 안내
        System.out.println("게임 선택");
        System.out.print("숫자입력 : 1\n문자입력 : 2\n종료 : 9\n입력 : ");
    }

    static void gameProgram1(){ // 숫자입력시 실행될 게임 프로그램
        int winCount = 0;
        int drowCount = 0;
        int loseCount = 0;
        System.out.print("9를 입력하면 종료합니다\n설명보기 : 8\n");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("0 : 가위 1 : 바위 2 : 보 입력 : ");
            int user = scanner.nextInt();

            int com = (int)(Math.random() * 3);// Math.random() -> 0~1 사이의 실수

            if (user == 8) System.out.println("9를 입력하면 종료합니다\n 설명보기 : 8\n");
            else if (user == 9){
                System.out.println("프로그램을 종료합니다");
                break;
            }
            else if (user - com == 0){
                ++drowCount;
                System.out.println("무승부");
                System.out.printf("%d승 %d무 %d패\n", winCount, drowCount, loseCount);
            }
            else if (user - com < 0){
                ++winCount;
                System.out.println("승리");
                System.out.printf("%d승 %d무 %d패\n", winCount, drowCount, loseCount);
            }
            else if(user - com > 0 && user - com < 3){
                ++loseCount;
                System.out.println("패배");
                System.out.printf("%d승 %d무 %d패\n", winCount, drowCount, loseCount);
            }
            else {
                System.out.println("잘못된 입력입니다");
                System.out.printf("%d승 %d무 %d패\n", winCount, drowCount, loseCount);
            }
        }
    }

    static int trance(String x){ // gameProgram2 실행시 입력받은 user값을 정수로 변환
        int y = 10;
        if (x.equals("가위")) y = 0;
        else if (x.equals("바위")) y = 1;
        else if (x.equals("보")) y = 2;
        else return y;
        return y;
    }

    static void gameProgram2(){ //문자 입력시 실행될 게임 프로그램
        int winCount = 0;
        int drowCount = 0;
        int loseCount = 0;
        System.out.print("'종료'를 입력하면 종료합니다\n설명보기 : 'help'\n");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("가위 바위 보\n입력 : ");
            String user = scanner.next();
            int user_int = trance(user);
            int com = (int)(Math.random() * 3);// Math.random() -> 0~1 사이의 실수

            if (user.equalsIgnoreCase("help")) System.out.println("'종료'를 입력하면 종료합니다\n 설명보기 : 'help'\n");
            else if (user.equalsIgnoreCase("종료")){
                System.out.println("프로그램을 종료합니다");
                break;
            }
            else if (user_int - com == 0){
                ++drowCount;
                System.out.println("무승부");
                System.out.printf("%d승 %d무 %d패\n", winCount, drowCount, loseCount);
            }
            else if (user_int - com < 0){
                ++winCount;
                System.out.println("승리");
                System.out.printf("%d승 %d무 %d패\n", winCount, drowCount, loseCount);
            }
            else if(user_int - com > 0 && user_int - com < 3){
                ++loseCount;
                System.out.println("패배");
                System.out.printf("%d승 %d무 %d패\n", winCount, drowCount, loseCount);
            }
            else if(user_int == 10) {
                System.out.println("잘못된 입력입니다");
                System.out.printf("%d승 %d무 %d패\n", winCount, drowCount, loseCount);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        gameOn();
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                gameProgram1();
                break;
            case 2:
                gameProgram2();
                break;
            case 9:
                break;
        }
    }
}
