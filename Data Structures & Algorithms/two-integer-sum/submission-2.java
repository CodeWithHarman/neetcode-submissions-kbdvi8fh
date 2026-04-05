class Solution {
    public int[] twoSum(int[] nums, int target) {
       // we have given an array and we need to find two numbers == target

       Map<Integer, Integer> map = new HashMap<>(); //initialize a hashmap to store index and numbers

       for(int i=0; i<nums.length; i++){
        int num = target - nums[i]; //get the required number
            if(map.containsKey(num)){ //check if the map has the required number
                return new int[] {map.get(num), i}; //if yes the return a new array with the number and its index
            }
            map.put(nums[i], i); //fill the map with the array values and indicies
       } 

       return new int[] {}; // if no result is found return an empty array
    }
}
