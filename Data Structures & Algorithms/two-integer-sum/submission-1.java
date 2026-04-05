class Solution {
    public int[] twoSum(int[] nums, int target) {
       // we have given an array and we need to find two numbers == target

       Map<Integer, Integer> map = new HashMap<>();

       for(int i=0; i<nums.length; i++){
        int num = target - nums[i];
            if(map.containsKey(num)){
                return new int[] {map.get(num), i};
            }
            map.put(nums[i], i);
       } 

       return new int[] {};
    }
}
