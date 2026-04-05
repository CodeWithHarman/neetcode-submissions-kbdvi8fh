class FirstUnique {
    private Queue<Integer> queue;
    private Map<Integer, Integer> freq;

    public FirstUnique(int[] nums) {
        queue = new LinkedList<>();
        freq = new HashMap<>();
        for(int num : nums){
            add(num);
        }
    }

    public int showFirstUnique() {
        // Remove non-unique numbers from front
        while(!queue.isEmpty() && freq.get(queue.peek()) > 1){
            queue.poll();
        }
        return queue.isEmpty() ? -1 : queue.peek();
    }

    public void add(int value) {
        freq.put(value, freq.getOrDefault(value, 0) + 1);
        queue.offer(value);
    }
}


/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */
