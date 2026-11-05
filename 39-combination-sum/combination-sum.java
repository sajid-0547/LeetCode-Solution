class Solution {

    void combine(List<List<Integer>> ans, List<Integer> arr,
                 int nums[], int i, int target) {

                    if(i>=nums.length || target<0){
                        return;
                    }
                    if(target==0){
                        ans.add(new ArrayList<>(arr));
                        return;
                    }

        arr.add(nums[i]);

        combine(ans,arr,nums,i,target-nums[i]);

        arr.remove(arr.size()-1);
        combine(ans,arr,nums,i+1,target);
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();

        combine(ans, arr, nums, 0, target);

        return ans;
    }
}