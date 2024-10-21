package projectHandGame;

public class trance {
    static int trance(String x){ // gameProgram2 실행시 입력받은 user값을 정수로 변환

        switch (x){
            case "s":
                return 0;
            case "r":
                return 1;
            case "p":
                return 2;
            case "설명":
                return 3;
            case "종료":
                return 4;
            default:
                return 9999;
        }
    }
}
