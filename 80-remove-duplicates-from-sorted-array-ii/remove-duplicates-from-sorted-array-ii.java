class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int k = 0;
        int count = 1;

        while(i != nums.length-1){
            if(nums[i] == nums[i+1]){
                count++;
                if(count<=2){
                    nums[k++] = nums[i];
                }
            }else{
                nums[k++] = nums[i];
                count = 1;
            }
            i++;
        }

        
            nums[k++] = nums[i];
        

        return k;
    }
}