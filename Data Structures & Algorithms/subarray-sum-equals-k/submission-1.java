class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int newSum = 0;
        int count = 0;

        for (int num : nums) {
            newSum += num;

            if (map.containsKey(newSum - k)) {
                count += map.get(newSum - k);
            }

            map.merge(newSum, 1, Integer::sum);
        }

        return count;
    }
}