
class Solution {

    private Map<String, PriorityQueue<String>> graph = new HashMap<>();
    private LinkedList<String> result = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {

        // Step 1: Build graph
        for (List<String> ticket : tickets) {
            String from = ticket.get(0);
            String to = ticket.get(1);

            graph.putIfAbsent(from, new PriorityQueue<>());
            graph.get(from).offer(to);
        }

        // Step 2: Start DFS from JFK
        dfs("JFK");

        return result;
    }

    private void dfs(String airport) {

        PriorityQueue<String> destinations = graph.get(airport);

        while (destinations != null && !destinations.isEmpty()) {
            String next = destinations.poll();
            dfs(next);
        }

        // Post-order insertion
        result.addFirst(airport);
    }
}