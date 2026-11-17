class Solution {
    public boolean isPalindrome(String s) {
        int startIndex = 0;
        int endIndex = s.length() - 1;

        while (startIndex < endIndex) {
            char startChar = s.charAt(startIndex);
            char endChar = s.charAt(endIndex);

            if (!Character.isLetterOrDigit(startChar)) {
                startIndex++;
                continue;
            }
            if (!Character.isLetterOrDigit(endChar)) {
                endIndex--;
                continue;
            }
            if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
                return false;
            }

            startIndex++;
            endIndex--;
        }

        return true;
    }
}