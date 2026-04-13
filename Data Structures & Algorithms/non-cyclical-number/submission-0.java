class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while(!seen.contains(n)){
            seen.add(n);
            n = helper(n);
            if(n==1) return true;
        }
        return false;
    }

    private int helper(int n){
        int sum = 0;
        while(n >0){
            int digit = n%10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
