class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int[] result = new int[nums.length];
        for(int num : nums){
            queue.offer(num);
        }
        for(int i=0; i<nums.length; i++){
            result[i] = queue.poll();
        }
        return result;
    }
}