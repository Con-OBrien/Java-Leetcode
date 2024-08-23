package LeetCode;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int i=0;
        //Start at pos 1 to end of array
        //If the latter pos (j) doesn't match the one at 0, we increase i and set the value in the array at i to the one after
        //i.e. 1,1,2  - nums[j] starts at 1, it does equal the one before, so we dont increase i but we go onto the next iteration
        //so then we compare 2 to the first value which does not equal it so we enter the if block and increase i and sets the value at nums[i] to the number at nums[j]
        // that means the value at pos 0, 1, becomes 2, we're at the end of the loop then so i would be 1 so we add 1 we is 2 values
        for(int j=1; j<nums.length;j++) {
            if(nums[i]!=nums[j]) {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicates(nums));
    }
}
