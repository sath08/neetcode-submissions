class Solution {
    public int longestConsecutive(int[] nums) {
        // Input Validation
        if (nums.length == 0) {
            return 0;
        }

        // Sort the array
        Arrays.sort(nums);

        int longestSequence = 0;
        int currentSequence = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] - 1) {
                currentSequence++;
            } else if (nums[i] == nums[i + 1]) {
                continue;
            } else {
                longestSequence = Math.max(longestSequence, currentSequence);
                currentSequence = 1;
            }
        }
        return Math.max(longestSequence, currentSequence);
    }
}
