class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length]; //get an empty array of length nums.length
        //step 1: prefix
        result[0] = 1;
        for(int i=1; i<nums.length; i++){
            result[i] = result[i-1] * nums[i-1]; //multiply res[i] with nums[i]
        }

        //step 2: suffix
        int rightNum = 1;
        for(int i=nums.length-1; i>=0; i--){
            result[i] = result[i] * rightNum;
            rightNum *= nums[i];
        }

        return result;
    }
}  
