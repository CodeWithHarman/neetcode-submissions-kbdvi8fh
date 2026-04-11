class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        int row = heights.length;
        int col = heights[0].length;

        boolean[][] pacific = new boolean[row][col];
        boolean[][] atlantic = new boolean[row][col];

        for(int i=0; i<row; i++) helper(heights, i, 0, pacific);
        for(int i=0; i<col; i++) helper(heights, 0, i, pacific);

        for(int i=0; i<row; i++) helper(heights, i, col-1, atlantic);
        for(int i=0; i<col; i++) helper(heights, row-1, i, atlantic);

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(pacific[i][j] && atlantic[i][j]){
                    result.add(Arrays.asList(i,j));
                }
            }
        }
        return result;
    }

    private void helper(int[][] heights, int row, int col, boolean[][] visited){
        int r = heights.length;
        int c = heights[0].length;

        if(row<0 || row>=r || col<0 || col >=c || visited[row][col]) return;
        

        visited[row][col] = true;
        int value = heights[row][col];

        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        for(int[] direction : directions){
            int newRow = row + direction[0];
            int newCol = col + direction[1];

            if(newRow<0 || newCol<0 || newRow >=r || newCol>=c) continue;

            if(heights[newRow][newCol] >= value){
                helper(heights, newRow, newCol, visited);
            }
        }
    }
}
