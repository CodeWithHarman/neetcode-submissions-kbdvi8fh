class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.merge(num, 1, Integer::sum);
        }

        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i]) > nums.length/2){
                return nums[i];
            }
        }
        return 0;
    }
}