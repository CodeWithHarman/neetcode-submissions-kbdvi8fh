class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length]; //get an empty array of length nums.length
        //step 1: prefix
        result[0] = 1;
        for(int i=1; i<nums.length; i++){
            result[i] = result[i-1] * nums[i-1]; //multiply res[i] with nums[i]
        }
         
        // result[1,1, 2, 8 ]

        //step 2: suffix
        int rightNum = 1; 
        for(int i=nums.length-1; i>=0; i--){
            result[i] = result[i] * rightNum; //8, 12, 24, 48
            rightNum *= nums[i]; // 6 , 24, 48
        }

        return result; //[48, 24, 12, 8]
    }
}  
