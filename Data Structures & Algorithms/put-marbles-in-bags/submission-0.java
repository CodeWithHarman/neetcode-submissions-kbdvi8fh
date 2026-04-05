class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        if(k==0) return 0;

        long[] pairSum = new long[n-1];

        for(int i=0; i<n-1; i++){
            pairSum[i] = weights[i] + weights[i+1];
        }

        Arrays.sort(pairSum);

        long min = 0;
        long max = 0;

        for(int i=0; i<k-1; i++){
            min += pairSum[i];
            max += pairSum[n-2-i];
        }
        return max-min;
    }
}