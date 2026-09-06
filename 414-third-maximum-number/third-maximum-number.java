class Solution {
    public int thirdMax(int[] nums) {

        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return nums[0]>nums[1]?nums[0]:nums[1];
        
        long max = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for(int i=0;i<nums.length;i++){

            if (nums[i] == max || nums[i] == max2 || nums[i] == max3) {
                continue;
            }

            if(nums[i]>max){
                max3 = max2;
                max2 = max;
                max = nums[i];
            }else if(nums[i]>max2 && max != nums[i]){
                max3 = max2;
                max2 = nums[i];
            }else if(nums[i]>max3){
                max3 = nums[i];              
            }
        }
        if(max3 == Long.MIN_VALUE){
            return (int)max;
        }

        return (int)max3;

    }
}