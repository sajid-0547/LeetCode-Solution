class Solution {
    public static boolean check(int[] nums,int h,int mid){
        long tih = 0;
        for(int i=0;i<nums.length;i++){
            
            if((nums[i]%mid)==0){
                tih += nums[i]/mid;
            }else{
                tih += (nums[i]/mid)+1;
            }
        }
        if(tih<=h) return true;

        return false;

        
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = 0;

        for(int i=0;i<n;i++){
            max = Math.max(max,piles[i]);
        }

        int s=1;
        int e=max;

        int ans = 0;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(check(piles,h,mid)){
                ans = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }

        }

        return ans;
    }
}