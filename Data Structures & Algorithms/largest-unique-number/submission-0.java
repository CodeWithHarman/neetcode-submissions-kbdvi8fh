class Solution {
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num : nums){
            freq.merge(num, 1, Integer::sum);
        }
        Arrays.sort(nums);

        for(int i=nums.length-1; i>=0; i--){
            if(freq.get(nums[i]) == 1){
                return nums[i];
            }
        }
        return -1;
    }
}
