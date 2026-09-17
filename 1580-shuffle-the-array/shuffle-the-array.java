class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        int  i = 0;
        while(i < nums.length){
            ans[i] = nums[i/2];
            i++;
            ans[i] = nums[n];
            n++;
            i++;
        }

        return ans;
    }
}