class Solution {
    public boolean canPermutePalindrome(String s) {
        int one = 0;
        Map<Character, Integer> freq = new HashMap<>();

        for(char ch : s.toCharArray()){
            freq.merge(ch, 1, Integer::sum);
        }

        for(int f : freq.values()){
            if( f%2 != 0) one++;
        }

        return one <= 1;
    }
}
