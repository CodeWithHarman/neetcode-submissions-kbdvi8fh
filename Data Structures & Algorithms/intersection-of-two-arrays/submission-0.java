class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        // add nums1 elements to set
        for (int num : nums1) {
            set.add(num);
        }

        // check nums2
        for (int num : nums2) {
            if (set.contains(num)) {
                resultSet.add(num);
            }
        }

        // convert set to int[]
        int[] result = new int[resultSet.size()];
        int i = 0;

        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }
}
