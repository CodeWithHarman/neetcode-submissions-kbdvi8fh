class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int res = 0;
        int left =0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            while(seen.contains(ch)){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(ch);
            res= Math.max(res, i-left+1);
        }
        return res;
    }
}
