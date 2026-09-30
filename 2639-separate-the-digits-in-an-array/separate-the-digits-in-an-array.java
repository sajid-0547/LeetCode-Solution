class Solution {
    public int[] separateDigits(int[] nums) {
        Stack<Integer> st = new Stack<>();

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i] >= 10){
                while(nums[i] > 0){
                       int s = nums[i]%10;
                       st.push(s);
                       nums[i] = nums[i]/10;
                }
            }else{
                st.push(nums[i]);
            }
        }

        int size = st.size();
        int[] ans = new int[size];

        for(int i=0;i<size;i++){
            ans[i] = st.peek();
            st.pop();
        }

        return ans;
        
    }
}