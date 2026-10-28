class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Steps: Calculate product without any 0s
        // Through loop, determine if no zeroes, one zero, or more than one
        int numZeroes = 0;
        int product = 1;
        for (int num : nums) {
            if (num == 0) {
                numZeroes++;
            } else {
                product *= num;
            }
        }
        // Create output array
        // If has no zeroes, loop through and divide
        // If has one zero, loop through and divide until zero which you just leave
        // If more than one zero, entire array is zero
        int[] output = new int[nums.length];
        for (int i = 0; i < output.length; i++) {
            if (numZeroes > 1) {
                return output;
            } else if (numZeroes > 0 && nums[i] != 0) {
                output[i] = 0;
            } else if (numZeroes > 0 && nums[i] == 0) {
                output[i] = product;
            } else {
                output[i] = product / nums[i];
            }
        }
        return output;
    }
}  
