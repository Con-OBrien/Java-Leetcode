package LeetCode;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] positions = new int[2];
        boolean found = false;

        for (int i = 0; i< nums.length && !found; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    positions[0] = i;
                    positions[1] = j;
                    found = true;
                    break;
                }
            }
        }
        return positions;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int target = 5;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
