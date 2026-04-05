class Solution {
    public int[] findBuildings(int[] heights) {
        List<Integer> result = new ArrayList<>();
        int n = heights.length;
        result.add(n-1);

        for(int i=n-2; i>=0; i--){
            if(heights[i] > heights[result.get(result.size()-1)]){
                result.add(i);
            }
        }

        Collections.reverse(result);
        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}