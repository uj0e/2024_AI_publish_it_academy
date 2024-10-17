package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class ex01 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("bs.txt")) {
            // 파일을 읽는 코드가 들어가야 함
            System.out.println("파일을 읽는 중...");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 자원 해제는 자동으로 처리됨
        System.out.println("자원 해제");
    }
}

/*
package exam01;

import java.io.FileInputStream;
import java.io.IOException;

public class ex01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("bs.txt");
            fis.close();
            System.out.println("자원 해제");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis != null){
                try{
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            System.out.println("자원 해제");
        }
    }
}
*/
