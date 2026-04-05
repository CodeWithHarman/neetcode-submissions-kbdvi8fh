class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int countOnes = 0;

        for(int num : nums){
            if(num == 1){
                countOnes++;
            }else{
                countOnes = 0;
            }
            maxOnes = Math.max(maxOnes, countOnes);
        }
        return maxOnes;
    }
}