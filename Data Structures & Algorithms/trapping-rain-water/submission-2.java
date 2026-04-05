class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int water = 0;
        int left = 0;
        int right = n-1;
        int leftHeight = height[left];
        int rightHeight = height[right];

        while(left < right){
            if(leftHeight < rightHeight){
                left++;
                if(leftHeight < height[left]){
                    leftHeight = height[left];
                }
                else{
                    water += leftHeight - height[left];
                }
            }else{
                right--;
                if(rightHeight < height[right]){
                    rightHeight = height[right];
                }else{
                    water += rightHeight - height[right];
                }
            }
        }
        return water;
    }
}
