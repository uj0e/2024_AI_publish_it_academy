package exam01;

public class ex01 {

//    static int[] nums2 = new int[4];
//    static int num;

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
        int[][] arr1 = {{10, 20, 30}, {30, 50, 60}};

        for(int i : arr){
            System.out.println(i);
        }

        System.out.println("#####");

        for (int[] i : arr1){
            for (int j : i){
                System.out.println(j);
            }
        }


/*        Student student = new Student();
        student.name = "Stive";
        student.id = 20241010;
        student.major = "programmer";
        student.study();*/


/*        int[][] nums = {{10,20,30}, {40,50,60}};
        System.out.printf("nums.length=%d%n", nums.length);
        System.out.printf("nums.length=%d%n", nums[0].length);

        int[] num1 = nums[0];
        num1[1] = 22;

        for (int i = 0; i< nums.length; ++i){
            for(int j = 0; j < nums[i].length; ++j){
                System.out.printf("%d행 %d열 = %d\n", i, j,nums[i][j]);
            }
        }*/

        /*        int[][] nums = new int[][]{
                {10,20,30},{40,50,60}
        };*/

/*        int[][] nums = {{10,20,30}, {40,50,60}};
        System.out.printf("nums.length=%d%n", nums.length);
        System.out.printf("nums.length=%d%n", nums[0].length);

        int[] num1 = nums[0];
        num1[1] = 22;

        for (int i = 0; i< nums.length; ++i){
            for(int j = 0; j < nums[i].length; ++j){
                System.out.printf("%d행 %d열 = %d\n", i, j,nums[i][j]);
            }
        }*/

/*        int[] nums1 = {10, 20, 30, 40, 50, 60, 70};

        System.out.printf("length = %d%n", nums1.length);

        for (int j : nums1) System.out.println(j);
        for (int i : nums1) System.out.println(i);*/

/*
        int[] nums;

        nums = new int[] {1,2,3,4};
        System.out.println(Arrays.toString(nums));
        System.out.printf(Arrays.toString(nums));
*/

    }

}
