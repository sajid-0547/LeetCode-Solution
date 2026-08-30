class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int index = nums.length-k;
        int[] arr = new int[nums.length];
        int i = 0;
        while(i != k){
            arr[i] = nums[index];
            index++;
            i++;
        }
        for(int j=0;j<nums.length-k;j++){
            arr[i] = nums[j];
            i++;
        }
        for(int l=0;l<nums.length;l++){
            nums[l] = arr[l];
        }

        
        
    }
}