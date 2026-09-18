class Solution {
    public int maxSubArray(int[] nums) {

        if(nums.length == 1) return nums[0];

        int maxSum = nums[0];
        int currentSum = 0;

        int i = 0;
        while(i<nums.length){
            currentSum += nums[i];

            maxSum = Math.max(currentSum,maxSum);

        if(currentSum < 0){
            currentSum = 0;
        }

        i++;
        }

        return maxSum;
        
    }
}