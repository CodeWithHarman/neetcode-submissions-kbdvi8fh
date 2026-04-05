class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        int n = s.length();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = s.charAt(i) - '0';
        }

        for(int i=1; i<n; i++){
            score += Math.abs(arr[i-1] - arr[i]);
        }

        return score;
    }
}