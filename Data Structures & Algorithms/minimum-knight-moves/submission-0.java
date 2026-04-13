class Solution {
    public int minKnightMoves(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);

        int[][] directions = {
            {1,2}, {2,1}, {-1,2}, {-2,1}, {1,-2}, {2,-1}, {-1,2}, {-2,-1}
        };

        Queue<int[]> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.offer(new int[]{0,0});
        visited.add("0,0");

        int steps = 0;

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0; i<size; i++){
                int[] curr = queue.poll();
                int cx = curr[0];
                int cy = curr[1];

                if(cx == x && cy == y){
                    return steps;
                }

                for(int[] dir : directions){
                    int nx = cx + dir[0];
                    int ny = cy + dir[1];

                    String key = nx + "," + ny;
                    if(!visited.contains(key)){
                        visited.add(key);
                        queue.offer(new int[]{nx,ny});
                    }
                }
            }
            steps++;
        }

        return -1;
    }
}
