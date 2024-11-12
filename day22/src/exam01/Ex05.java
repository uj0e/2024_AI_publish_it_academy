package exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) {
        // 1바이트씩 data.zip을 읽어와서 1바이트씩 copied_data1.zip으로 출력
        long stime = System.currentTimeMillis();
        try(FileInputStream fis = new FileInputStream("data.zip");
            FileOutputStream fos = new FileOutputStream("copied_data1.zip")){

            while (fis.available() > 0){
                fos.write(fis.read());
            }

        } catch (IOException e){
            e.printStackTrace();
        }
        long etime = System.currentTimeMillis();
        System.out.printf("걸린시간 : %d\n", etime - stime);
    }
}
