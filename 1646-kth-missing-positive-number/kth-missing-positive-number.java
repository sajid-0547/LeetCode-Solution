class Solution {
    public int findKthPositive(int[] arr, int k) {

        int ans = arr[0]-1;
        if(ans>=k) return k;
        k = k-ans;
        for(int i=0;i<arr.length-1;i++){
            int x = arr[i+1]-arr[i]-1;
            if(x >= k){
                ans = arr[i]+k;
                return ans;
            }
            k = k-x;
            
        }

        return arr[arr.length-1]+k;
    }
}