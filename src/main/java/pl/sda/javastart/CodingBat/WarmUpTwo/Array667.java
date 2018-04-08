package pl.sda.javastart.CodingBat.WarmUpTwo;

public class Array667 {

    public static void main(String[] args) {
        int[] ar = {1, 2, 6, 6, 9, 0, 8, 6, 7, 1, 1};
        System.out.println(array667(ar));
    }

    private static int array667(int[] nums) {

        int resoult = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i]== 6){
                if (nums[i + 1] == 6 || nums[i + 1] == 7) {

                    resoult++;

                }
            }
        }

        return resoult;
    }

}
