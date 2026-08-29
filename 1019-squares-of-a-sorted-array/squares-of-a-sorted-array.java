class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
       int i=0;
       int j=nums.length-1;
       int k=nums.length-1;
       while(i<=j){
        int left = nums[i]*nums[i];
        int right = nums[j]*nums[j];

        if(left>right){
            ans[k] = left;
            i++;
        }else{
            ans[k] = right;
            j--;
        }
        k--;
       }

       return ans;

        
    }
}