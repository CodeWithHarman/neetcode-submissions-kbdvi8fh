class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int left = 0;
        int right = n-1;
        int maxArea = 0;

        while(left < right){
            if(heights[left] < heights[right]){
                maxArea = Math.max(maxArea, heights[left] * (right-left) );
                left++;
            }else{
                maxArea = Math.max(maxArea, heights[right] * (right-left) );
                right--;
            }
        }
        return maxArea;
    }
}
