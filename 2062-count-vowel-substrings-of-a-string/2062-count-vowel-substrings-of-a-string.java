class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        int n = word.length();
        String vowels = "aeiou";

        // Outer loop: pick starting point
        for (int i = 0; i < n; i++) {
            String seen = "";
            
            // Inner loop: expand ending point
            for (int j = i; j < n; j++) {
                char ch = word.charAt(j);

                // Stop if a consonant is encountered
                if (vowels.indexOf(ch) == -1) {
                    break;
                }

                // Add character if it's a new vowel
                if (seen.indexOf(ch) == -1) {
                    seen += ch;
                }

                // Count if all 5 unique vowels are present
                if (seen.length() == 5) {
                    count++;
                }
            }
        }

        return count; // Return after both loops finish
    }
}