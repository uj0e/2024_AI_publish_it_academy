package exam01;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("hello.txt")){
            fos.write("Hello World!".getBytes());
            /*fos.write('H');
            fos.write('E');
            fos.write('L');
            fos.write('L');
            fos.write('O');

            fos.write(' ');

            fos.write('안');
            fos.write('녕');
            fos.write('하');
            fos.write('세');
            fos.write('요');
            fos.write('!');*/
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}