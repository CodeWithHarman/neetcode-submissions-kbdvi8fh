class Solution {
    public boolean validTree(int n, int[][] edges) {
        
        if(edges.length != n-1) return false;

        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0; i<n; i++){
            graph.add(i, new ArrayList<>());
        }

        for(int[] edge : edges){
            int root = edge[0];
            int leaf = edge[1];

            graph.get(leaf).add(root);
            graph.get(root).add(leaf);
        }

        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        
        queue.offer(0);
        visited[0] = true;

        int count = 0;

        while(!queue.isEmpty()){
            int current = queue.poll();
            count++;

            for(int neighbor : graph.get(current)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }

        return count == n;
    }
}
