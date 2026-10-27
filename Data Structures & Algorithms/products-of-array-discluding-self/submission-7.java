class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Steps: Calculate product without any 0s
        // Through loop, determine if no zeroes, one zero, or more than one
        boolean atLeastOneZero = false;
        boolean moreThanOneZero = false;
        int product = 1;
        for (int num : nums) {
            if (num == 0) {
                if (!atLeastOneZero) {
                    atLeastOneZero = true;
                } else if (atLeastOneZero && !moreThanOneZero) {
                    moreThanOneZero = true;
                    break;
                }
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
            if (moreThanOneZero) {
                output[i] = 0;
            } else if (atLeastOneZero && nums[i] != 0) {
                output[i] = 0;
            } else if (atLeastOneZero && nums[i] == 0) {
                output[i] = product;
            } else {
                output[i] = product / nums[i];
            }
        }
        return output;
    }
}  
