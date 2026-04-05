class Solution {
    public String customSortString(String order, String s) {
        int[] freq = new int[26];
        
        // Count frequency of chars in s
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        // Add chars in order
        for (char c : order.toCharArray()) {
            while (freq[c - 'a'] > 0) {
                sb.append(c);
                freq[c - 'a']--;
            }
        }
        
        // Add remaining chars
        for (char c : s.toCharArray()) {
            if (freq[c - 'a'] > 0) {
                sb.append(c);
                freq[c - 'a']--;
            }
        }
        
        return sb.toString();
    }
}
