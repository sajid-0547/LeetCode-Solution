class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new  HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int k=n/3;

        for(Integer key:map.keySet()){
            if(map.get(key)>k){
                list.add(key);
            }
        }


        return list;
    }
}