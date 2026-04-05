class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        double median = 0.0;
        int[] array = new int[n+m];
        int i=0,j=0,k=0;
        while(i < n && j < m){
            if(nums1[i] < nums2[j]){
                array[k++] = nums1[i++];
            }else{
                array[k++] = nums2[j++];
            }
        }

        while (i < n) array[k++] = nums1[i++];
        while (j < m) array[k++] = nums2[j++];

        if((n+m)%2 != 0){
            median = array[(n+m)/2];
        }else{
            double a = array[(n+m)/2];
            double b = array[(n+m)/2 - 1];
            median = (a + b )/2;
        }

        return median;
    }
}
