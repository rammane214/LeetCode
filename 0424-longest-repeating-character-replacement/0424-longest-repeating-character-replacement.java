class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character
            int index = s.charAt(right) - 'A';
            freq[index]++;

            // Maximum frequency in current window
            maxFreq = Math.max(maxFreq, freq[index]);

            // Characters that need replacement
            int windowLength = right - left + 1;
            int changes = windowLength - maxFreq;

            // If more than k replacements are needed
            if (changes > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            // Update answer
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}