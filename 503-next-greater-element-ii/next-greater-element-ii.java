class Solution {
    public int[] nextGreaterElements(int[] nums) {
        if(nums.length == 1) return new int[]{-1};
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int start=(i+1)%nums.length;
            int j = start;
            while(i != j){
                if(nums[j]>nums[i]){
                    arr[i] = nums[j];
                    break;
                }else{
                    arr[i] = -1;
                }
                j=(j+1)%nums.length;
            }
        }

        return arr;
    }
}