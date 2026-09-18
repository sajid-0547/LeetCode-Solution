class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];

            int s = 0;
            int e = n-1;

            while(s<=e){
                int mid = s+(e-s)/2;
                
                if(s==e || mid==0){
                    return nums[mid];
                }
                else if(nums[mid]>nums[mid-1] && nums[mid]<nums[mid+1]) return nums[mid];

                else if(nums[mid] == nums[mid-1] && (mid%2!=0)){
                    s = mid+1;
                }else if(nums[mid]==nums[mid+1] && (mid%2==0)){
                    s = mid+1;
                }else{
                    e = mid-1;
                }
            }

        return -1;
    }
}