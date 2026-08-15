import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String s : strs) {

            // Convert string to character array
            char[] chars = s.toCharArray();

            // Sort characters
            Arrays.sort(chars);

            // Convert back to String
            String key = new String(chars);

            // If key doesn't exist, create new ArrayList
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add original string
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}