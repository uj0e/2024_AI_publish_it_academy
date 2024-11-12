package exam01;

import java.io.File;

public class Ex19 {
    public static void main(String[] args) throws Exception {
        File dir = new File("D:/tmp/sub/sub2"); // 경로가 실제로 있는지 확인, 없을경우 생성
        if (!dir.exists()) { // 디렉토리가 없을 경우
            dir.mkdir(); // 디렉토리를 1개만 생성
            dir.mkdirs(); // 하위 디렉토리도 생성
        }
        File file = new File("D:/tmp/test.txt");

        file.createNewFile();
    }
}
