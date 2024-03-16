package easy;

import java.util.Arrays;

public class RunningSum {

    public static int[] runningSum(int[] nums) {

        int[] runningSumArray = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            runningSumArray[i] = sum;
        }
        return runningSumArray;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = runningSum(nums);

        // Print the contents of the array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
