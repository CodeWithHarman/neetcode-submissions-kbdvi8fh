class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length ==0) return -1;

        int rows = grid.length;
        int cols = grid[0].length;
        int fresh = 0;

        Queue<int[]> queue = new LinkedList<>();

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j] == 1){
                    fresh++;
                }else if(grid[i][j] == 2){
                    queue.offer(new int[]{i, j, 0});
                }
            }
        }

        if(fresh == 0) return 0;
        int minutes = 0;
        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        while(!queue.isEmpty()){
            int[] curr = queue.poll();
            int row = curr[0], col = curr[1], min = curr[2];
            minutes = min;

            for(int[] direction : directions){
                int r = row + direction[0];
                int c = col + direction[1];

                if(r>=0 && c>=0 && r<rows && c<cols && grid[r][c] == 1 ){
                    grid[r][c] = 2;
                    fresh--;
                    queue.offer(new int[]{r,c,min+1});
                }
            }
        }
        return fresh == 0 ? minutes : -1;
    }
}
