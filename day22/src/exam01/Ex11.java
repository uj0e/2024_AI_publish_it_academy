package exam01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("data.txt");
             DataOutputStream dos = new DataOutputStream(fos)){

            dos.writeInt(100);
            dos.writeBoolean(true);
            dos.writeUTF("Hello 스티브!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
