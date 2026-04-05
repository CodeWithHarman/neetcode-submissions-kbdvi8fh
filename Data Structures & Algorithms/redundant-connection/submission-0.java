

class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            if (hasPath(u, v, graph, new HashSet<>())) {
                // There is already a path between u and v -> adding this edge forms a cycle
                return edge;
            }
            // Add edge to the graph
            graph.putIfAbsent(u, new ArrayList<>());
            graph.putIfAbsent(v, new ArrayList<>());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return new int[0];
    }

    private boolean hasPath(int src, int dest, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        if (src == dest) return true;
        if (visited.contains(src)) return false;
        visited.add(src);
        if (!graph.containsKey(src)) return false;

        for (int neighbor : graph.get(src)) {
            if (hasPath(neighbor, dest, graph, visited)) {
                return true;
            }
        }
        return false;
    }
}

