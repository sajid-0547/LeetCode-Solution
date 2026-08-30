class Solution {
    void reverse(int[] nums,int start,int end) {
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {

        //addtional array

        // k=k%nums.length;
        // int index = nums.length-k;
        // int[] arr = new int[nums.length];
        // int i = 0;
        // while(i != k){
        //     arr[i] = nums[index];
        //     index++;
        //     i++;
        // }
        // for(int j=0;j<nums.length-k;j++){
        //     arr[i] = nums[j];
        //     i++;
        // }
        // for(int l=0;l<nums.length;l++){
        //     nums[l] = arr[l];
        // }

        // two pointer way

        k = k%nums.length;

        reverse(nums,0,nums.length-1); 
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        
    }
}