class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int count = 0;
        for(Integer key:map.keySet()){
            if(map.get(key) == 1){
                count++;
            }
        }

        int[] ans = new int[count];

        int i=0;
        for(Integer key:map.keySet()){
            if(map.get(key) == 1){
                ans[i] = key;
                i++;
            }
        }
        return ans;
    }
}