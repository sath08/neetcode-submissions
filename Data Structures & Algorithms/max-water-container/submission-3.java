class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int currMax = 0;

        while (left < right) {
            int shorterLen = Math.min(heights[left], heights[right]);
            int area = (right - left) * shorterLen;
            if (currMax < area) {
                currMax = area;
            }
            if (heights[left] == shorterLen) {
                left++;
            } else {
                right--;
            }
        }
        return currMax;
    }
}
