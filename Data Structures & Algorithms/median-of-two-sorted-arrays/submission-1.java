class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        double median = 0.0;
        int[] array = new int[n+m];

        int i=0, j=0;

        while( i < n ){
            array[i] = nums1[i];
            i++;
        }
        while( j < m ){
            array[i++] = nums2[j];
            j++;
        }
        Arrays.sort(array);
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
