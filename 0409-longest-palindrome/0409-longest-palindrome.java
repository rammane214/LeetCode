class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];

        // Count characters
        for (char ch : s.toCharArray()) {
            count[ch]++;
        }

        int result = 0;
        boolean hasOdd = false;

        // Calculate palindrome length
        for (int i = 0; i < 128; i++) {
            int val = count[i];

            result += (val / 2) * 2;

            if (val % 2 == 1) {
                hasOdd = true;
            }
        }

        // One odd character can be placed in the center
        if (hasOdd) {
            result++;
        }

        return result;
    }
}