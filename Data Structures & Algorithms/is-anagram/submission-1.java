class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false; //if the length is not same return false
      int[] arr = new int[26];

      for(int i=0; i<s.length(); i++){ // counting frequency
        arr[s.charAt(i) - 'a']++; // incrementing the freq
        arr[t.charAt(i) - 'a']--; // decrementing the freq
      }
     // if the freq is 0 that means it's a valid anagram
      for(int count : arr){
        if (count != 0) return false;
      }
      return true;
    }
}
