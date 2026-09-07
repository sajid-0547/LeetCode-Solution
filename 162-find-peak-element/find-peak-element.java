class Solution {
    public int findPeakElement(int[] nums) {

        if(nums.length == 1) return 0;

        int s = 0;
        int e = nums.length-1;

        while(s<=e){
            int mid = s+(e-s)/2;

            if(((mid-1<0)?true:(nums[mid]>nums[mid-1])) && ((mid+1>= nums.length)?true:(nums[mid]>nums[mid+1]))){
                return mid;
            }else if(nums[mid]<nums[mid+1]){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }

        return 0;

    }
}