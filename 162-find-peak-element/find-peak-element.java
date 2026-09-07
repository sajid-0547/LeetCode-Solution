class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1) return 0;
        int i=0;
        int j=nums.length-1;

        while(i<j){
            if(nums[i] < nums[j]){
                i++;
            }else if(nums[i] > nums[j]){
                j--;
            }else{
                i++;
            }
        }

        return j;
        
    }
}