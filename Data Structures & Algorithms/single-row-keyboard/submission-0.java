class Solution {
    public int calculateTime(String keyboard, String word) {
        int result = 0;
        int j = 0;
        for(char ch : word.toCharArray()){
            for(int i=0; i<26; i++){
                if(keyboard.charAt(i) == ch){
                    result += Math.abs(i - j);
                    j = i; 
                }
            }
        }
        return result;
    }
}
