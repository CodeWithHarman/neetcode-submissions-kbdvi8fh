class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int max = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '('){
                sum++;
                max = Math.max(max, sum );
            }else if(s.charAt(i) == ')'){
                sum--;
            }
        }
        return max;
    }
}