class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int min = 1;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
        }

        int ans = 0;
        while(min <= max){
            int mid = (min+max)/2;
            int temp = 0;
            for(int i=0;i<nums.length;i++){
                int x = (nums[i] % mid == 0) ? nums[i] / mid : nums[i] / mid + 1;
                temp = temp + x;
            }
            if(temp <= threshold){
                ans = mid;
                max = mid-1;
            }
            else{
                min = mid+1;
            }
        }

        return ans;
    }
}