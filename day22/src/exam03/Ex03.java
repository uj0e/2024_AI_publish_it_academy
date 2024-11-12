package exam03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ex03 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DayOfWeek week = today.getDayOfWeek();
        int yoil = week.getValue();
        System.out.println(yoil);

        String name = week.getDisplayName(TextStyle.FULL, Locale.TRADITIONAL_CHINESE);
        System.out.println(name);
    }
}
