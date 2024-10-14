package exam01;

public class Schedule {


    void showDate(int year, int month, int day){
        if (month == 2){
            if (29 < day){
                System.out.println("날짜 오류입니다");
                return;
            }
        }

        System.out.printf("year = %d \n month = %d \n day = %d\n", year, month, day);
    }
}
