class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        int ops = 0;

        for (int freq : map.values()) {
            if (freq == 1) return -1;

            //ops += freq / 3;
           // if (freq % 3 != 0) ops++;
            ops += (freq + 2) / 3;
        }

        return ops;
    }
}
