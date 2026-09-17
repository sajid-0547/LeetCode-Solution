class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        int start = 0;
        int end = 1;
        int i = 0;

        while(n <nums.length){
            ans[start] = nums[i++];
            start = start+2;
            ans[end] = nums[n++];
            end = end+2;
        }

        return ans;
    }
}