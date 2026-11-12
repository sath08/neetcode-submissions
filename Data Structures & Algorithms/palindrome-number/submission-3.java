class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int reversedX = 0;
        while (num > 0) {
            reversedX *= 10;
            reversedX += num % 10;
            num /= 10;
        }
        return (reversedX == x);
    }
}