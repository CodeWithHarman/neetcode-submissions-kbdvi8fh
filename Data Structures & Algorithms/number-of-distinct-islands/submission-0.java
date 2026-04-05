class Solution {
    public int numDistinctIslands(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;

        Set<String> shapes = new HashSet<>();
        int n = grid.length;
        int m = grid[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    StringBuilder sb = new StringBuilder();
                    dfs(grid, i, j, sb, "S"); // S = start marker
                    shapes.add(sb.toString());
                }
            }
        }

        return shapes.size();
    }

    private void dfs(int[][] grid, int r, int c, StringBuilder path, String dir){
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0)
            return;

        grid[r][c] = 0;
        path.append(dir);

        dfs(grid, r+1, c, path, "D");
        dfs(grid, r-1, c, path, "U");
        dfs(grid, r, c+1, path, "R");
        dfs(grid, r, c-1, path, "L");

        path.append("B"); // backtracking marker
    }
}
