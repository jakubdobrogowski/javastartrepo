package pl.sda.javastart.CodingBat.Array1;

public class SwapEnds {

    public static void main(String[] args) {

        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        swap(x);
    }

    private static int[] swap(int[] nums) {

        if (nums.length == 0) {

            int[] tablica = {};

            return tablica;
        }

        if (nums.length == 1) {

            return new int[]{nums[0]};
        }

        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }


}
