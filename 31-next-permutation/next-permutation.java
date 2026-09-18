class Solution {
    public static void reverse(int[] nums,int s,int e){
        while(s<=e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int pivot = n-1;
        int i = pivot-1;
        while(i >= 0){
            if(nums[i]<nums[i+1]){
                break;
            }
            i--;
        }
        if(i<0){
            reverse(nums,0,n-1);
            return;
        }

        while(nums[pivot]<=nums[i]){
            pivot--;
        }

        int temp = nums[i];
        nums[i] = nums[pivot];
        nums[pivot] = temp;

        pivot = i;

        int s = pivot+1;
        int e = n-1;

        reverse(nums,s,e);


        
    }
}