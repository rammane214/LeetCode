class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();
         for(String word: words){
            ans.append(new StringBuilder(word).reverse());
            ans.append(" ");
        }
        ans.deleteCharAt(ans.length() -1);
        return ans.toString();
    }
}