class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) { return 0; }
        
        Arrays.sort(nums);
        int longestSequence = 1;
        int currentSequence = 1;
        int previousNumber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == previousNumber + 1) {
                currentSequence++;
            } else if (nums[i] == previousNumber) {
                continue;
            } else {
                if (currentSequence > longestSequence) {
                    longestSequence = currentSequence;
                }
                currentSequence = 1;
            }
            previousNumber = nums[i];
        }
        return Math.max(longestSequence, currentSequence);
    }
}
