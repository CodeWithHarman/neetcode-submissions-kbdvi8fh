class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length; 
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num : nums){
            freqMap.merge(num, 1, Integer::sum);
        }

        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        
        Arrays.sort(arr, (a,b) -> {
            int freqA = freqMap.get(a), freqB = freqMap.get(b);
            if(freqA != freqB) return Integer.compare(freqA, freqB);
            return Integer.compare(b,a);
        });

        return Arrays.stream(arr).mapToInt(i -> i).toArray();
    }
}