class Solution {
    public int longestConsecutive(int[] nums) {
        // Input Validation
        if (nums.length == 0) {
            return 0;
        }

        int longestStreak = 1;

        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currStreak = 1;
                int currNum = num;
                while (set.contains(currNum + 1)) {
                    currStreak++;
                    currNum++;
                }
                longestStreak = Math.max(currStreak, longestStreak);
            }
        }
        return longestStreak;
    }
}
