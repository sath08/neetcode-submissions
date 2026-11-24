class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }

        int longestSequence = 0;
        for (int num : set) {
            if (!(set.contains(num - 1))) {
                int currentSequence = 1;
                int currNumber = num;
                while (set.contains(currNumber + 1)) {
                    currNumber++;
                    currentSequence++;
                }
                longestSequence = Math.max(longestSequence, currentSequence);
            }
        }
        return longestSequence;
    }
}
