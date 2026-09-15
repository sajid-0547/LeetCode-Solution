class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int s = 0;
        int e = nums.length-1;
        int mid = s + (e-s)/2;
        int temp = nums[mid];

        int ans = 0;

        for(int i=0;i<nums.length;i++){
            int sum = temp - nums[i];
            ans += Math.abs(sum);
        }


        return ans;

        
    }
}