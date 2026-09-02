class Solution {
    public int findDuplicate(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }

        // for(Integer key:map.keySet()){
        //     if(map.get(key) >= 2){
        //         return key;
        //     }
        // }
        // return 0;

        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                return nums[i];
            }
        }
        return 0;

        
    }
}