package exam01;

import java.util.Optional;

public class Ex01 {
    public static void main(String[] args) {
        /*String str = "ABC";
        Optional<String> opt = Optional.of(str);*/
        String str = null;
        Optional<String> opt = Optional.of(str);
        String str2 = opt.get(); // 값이 없으면 NoSuchElementException 발생
        String str3 = opt.orElse("ABCD"); // 값이 없으면 "ABCD" 출력
        System.out.println(str3);
    }
}
