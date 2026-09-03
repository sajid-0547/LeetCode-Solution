class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        int[] arr = new int[len1+len2];

        int i = 0;
        int j = 0;
        int k = 0;
        while(i<len1 && j<len2){
            if(nums1[i]<nums2[j]){
                arr[k] = nums1[i];
                i++;
                k++;
            }else{
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }

        while(i<len1){
            arr[k] = nums1[i];
            k++;
            i++;
        }

        while(j<len2){
            arr[k] = nums2[j];
            k++;
            j++;
        }

        double ans = 0;

        if((len1+len2)%2 == 1){
            ans = arr[(len1+len2)/2];
            return ans;
        }


        int a = (len1+len2)/2-1;
        int b = (len1+len2)/2;

        ans = (arr[a]+arr[b])/2.0;

        return ans;

    }
}