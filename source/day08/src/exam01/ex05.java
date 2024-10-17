package exam01;

import java.util.Arrays;

public class ex05 {
    public static void main(String[] args) {
        sum(10,20,30);
        sum(10,20,30,40);
        sum(10,20);
    }
    public static int sum(int...nums){
        // nums -> int[]
        System.out.println(Arrays.toString(nums));
        return 0;
    }
}
