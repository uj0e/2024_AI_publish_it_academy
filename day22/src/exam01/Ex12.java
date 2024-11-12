package exam01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex12 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("data.txt");
             DataInputStream dis = new DataInputStream(fis)){

            boolean result = dis.readBoolean();
            int num = dis.readInt();
            String str = dis.readUTF();

            System.out.printf("num = %d\nresult = %s\nstr = %s\n", num, result, str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
