class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        List<List<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[numCourses];

        for(int i=0; i<numCourses; i++){
            graph.add(i, new ArrayList<>());
        }

        for(int[] prerequisite : prerequisites){
            int course = prerequisite[0];
            int prereq = prerequisite[1];

            graph.get(prereq).add(course);
            indegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        int completed = 0;

        for(int i=0; i<numCourses; i++){
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }

        List<Integer> result = new ArrayList<>();

        while(!queue.isEmpty()){
            int current = queue.poll();
            completed++;
            result.add(current);

            for(int neighbor : graph.get(current)){
                indegree[neighbor]--;
                if(indegree[neighbor] == 0){
                    queue.offer(neighbor);
                }
            }
        }

        return (completed == numCourses) ? result.stream().mapToInt(Integer::intValue).toArray() : new int[0];
    }
}
