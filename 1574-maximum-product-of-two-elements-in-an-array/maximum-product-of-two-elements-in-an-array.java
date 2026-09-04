class Solution {
    public int maxProduct(int[] nums) {
        
    // Arrays.sort(nums);
    // return ((nums[nums.length-1]-1)*(nums[nums.length-2]-1));

    int larg = 0;
    int second = 0;

    for(int num: nums){
        if(num>larg){
            second = larg;
            larg = num;     
        }else if(num>second){
            second  = num;
        }
    }

    return (larg-1)*(second-1);

    }
}