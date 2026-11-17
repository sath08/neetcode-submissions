class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int currMax = 0;

        while (left < right) {
            int area = (right - left) * Math.min(heights[left], heights[right]);
            currMax = Math.max(currMax, area);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return currMax;
    }
}
