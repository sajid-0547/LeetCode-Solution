class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length-1;i++){
            int temp = Math.abs(nums[i]-nums[i+1]);
            if(temp > ans ){
                ans = temp;
            }
        }

        int s = Math.abs(nums[0]-nums[nums.length-1]);

        if(s>ans){
            ans = s;
        }

        return ans;
    }
}