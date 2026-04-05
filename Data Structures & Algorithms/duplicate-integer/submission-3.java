class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums); //sorting the array
        for(int i=1; i<nums.length; i++){ // looping through the array
            if(nums[i] == nums[i-1]) return true; //checking if the previous number is same
        } // if the previous number is same return true
        return false; //else return false
    }
}