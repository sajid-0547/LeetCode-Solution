class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> list = new ArrayList<>();

        // Arrays.sort(nums);

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         list.add(i);
        //     }
        // }
        // return list;

        int count = 0;
        int s = 0;

        for(int i=0;i<nums.length;i++){
            if(target > nums[i]){
                s++;
            }
                if(target == nums[i]){
                    count++;
                }
        }

        while(count != 0){
            list.add(s);
            count--;
            s++;
        }

        return list;
    }
}