class Solution {
    public int totalNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                for(int k=0;k<nums.length;k++){

                    if(i==j || i==k || j==k) continue;
                    if(nums[i]==0) continue;
                    ans = 100*nums[i]+10*nums[j]+nums[k];
                    if(!list.contains(ans) && ans%2==0){
                        list.add(ans);
                    }
                }
            }
        }

        return list.size();
    }
}