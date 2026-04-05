class Solution {
    public int connectSticks(int[] sticks) {
        if(sticks.length == 1) return 0;
        int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int stick : sticks){
            pq.add(stick);
        }

        while(pq.size() > 1){
            int stick1 = pq.poll();
            int stick2 = pq.poll();

            int cost = stick1 + stick2;

            sum += cost;

            pq.add(cost);
        }
        return sum;
    }
}
