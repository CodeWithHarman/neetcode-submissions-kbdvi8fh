class Solution {
    public int longestConsecutive(int[] nums) {
        int len = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        for(int num : set){
            if(!set.contains(num-1)){
                int curr = num;
                int streak = 1;
                while(set.contains(curr+1)){
                    curr++;
                    streak++;
                }
                len = Math.max(len, streak);
            }
        }
        return len;
    }
}
