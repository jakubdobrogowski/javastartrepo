package pl.sda.javastart.CodingBat.WarmUpTwo;

public class ArrayOneTwoThree {

    public static void main(String[] args) {

        int[] tab = {1, 1, 1, 1, 1, 3, 1, 1, 1, 2,1,2,3};
        System.out.println();
        System.out.println(array(tab));
    }


    public static boolean array(int[] nums) {
        for (int i=0; i < (nums.length-2); i++) {

            if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) {

                return true;
            }
        }
        return false;
    }

}

