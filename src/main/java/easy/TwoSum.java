package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

//    public static int[] twoSum(int[] nums, int target) {
//
//        int[] result = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    result[0] = i;
//                    result[1] = j;
//                    return result;
//                }
//            }
//        }
//        return result;
//    }

    // More efficient version
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        // Test array and target
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call the twoSum method with the array and target
        int[] result = twoSum(nums, target);

        // Print the result
        System.out.println("Indices of the two numbers whose sum is equal to target: " + result[0] + ", " + result[1]);
    }
}


