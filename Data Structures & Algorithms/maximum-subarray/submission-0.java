class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];       // overall max
        int currentSum = nums[0];   // max ending at current index

        for(int i = 1; i < nums.length; i++){
            // decide whether to extend or start new subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

