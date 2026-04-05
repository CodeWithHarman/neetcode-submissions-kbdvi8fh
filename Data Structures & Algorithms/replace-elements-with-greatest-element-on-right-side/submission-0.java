class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int rightmax = -1;

        for(int i=n-1; i>=0; i--){
            res[i] = rightmax;
            rightmax = Math.max(rightmax, arr[i]);
        }
        return res;
    }
}