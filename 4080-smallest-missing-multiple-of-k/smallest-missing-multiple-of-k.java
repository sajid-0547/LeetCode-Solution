class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        int i=1;
        while(i<=nums.length){
            if(list.contains(i*k)){
                i++;
            }else{
                return k*i;
            }
        }
        return k*i;
    }
}