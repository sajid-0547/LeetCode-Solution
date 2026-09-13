class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        ArrayList<Integer> list = new ArrayList<>();

        int count = 1;
        int k = n / 3;

        for(int i=0;i<nums.length;i++){
            if(i==n-1){
                if(count > k){
                    if(!list.contains(nums[i])){
                        list.add(nums[i]);
                    }
                }
                    break;
            }
            if(nums[i+1]==nums[i]){
                count++;
                if(count>k){
                    if(!list.contains(nums[i])){
                        list.add(nums[i]);
                    }
                }
            }else{
                if(count>k){
                    if(!list.contains(nums[i])){
                        list.add(nums[i]);
                    }
                }
                count = 1;
            }
        }

        return list;
        
    }
}