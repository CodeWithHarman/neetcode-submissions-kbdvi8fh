class Solution {
    public int countComponents(int n, int[][] edges) {

        List<List<Integer>> graph = new ArrayList<>();
        boolean[] visited = new boolean[n];
        int result = 0;

        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int a = edge[0];
            int b = edge[1];

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i=0; i<n; i++){
            if(!visited[i]){
                bfs(graph, visited, i);
                result++;
            }
        }
        
        return result;
    }

    private void bfs(List<List<Integer>> graph, boolean[] visited, int i){
        Queue<Integer> queue = new LinkedList<>();
            queue.offer(i);
            visited[i] = true;

            while(!queue.isEmpty()){
                int current = queue.poll();

                for(int neighbor : graph.get(current)){
                    if(!visited[neighbor]){
                        visited[neighbor] = true;
                        queue.offer(neighbor);
                } 
            }
        }
    }
}
