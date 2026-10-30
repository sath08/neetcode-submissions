class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        Set<Character> alphaNumericChars = Set.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0');

        int leftSide = 0;
        int rightSide = s.length() - 1;

        while (leftSide < rightSide) {
            Character l = s.charAt(leftSide);
            if (!alphaNumericChars.contains(l)) {
                leftSide++;
                continue;
            }
            Character r = s.charAt(rightSide);
            if (!alphaNumericChars.contains(r)) {
                rightSide--;
                continue;
            }
            if (l != r) {
                return false;
            } else {
                rightSide--;
                leftSide++;;
            }
        }
        return true;
    }
}
