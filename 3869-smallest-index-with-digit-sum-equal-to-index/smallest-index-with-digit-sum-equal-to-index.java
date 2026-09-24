class Solution {
    static boolean equal(int n,int i){
        int sum=0;
        while(n>0){
            int s = n%10;
            sum = sum+s;
            n = n/10;
        }

        if(sum == i) return true;

        return false;
    }
    public int smallestIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            if(equal(nums[i],i)) return i;
        }


        return -1;
    }
}