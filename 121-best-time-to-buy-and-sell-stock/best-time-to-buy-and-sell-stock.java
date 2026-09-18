class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n==1) return 0;
        Stack<Integer> st = new Stack<>();
        st.push(prices[n-1]);

        int ans = 0;
        for(int i=n-2;i>=0;i--){
            if(prices[i] > st.peek()){
                st.pop();
                st.push(prices[i]);
            }else{
                int temp = st.peek()-prices[i];
                if(temp > ans){
                    ans = temp;
                }
            }
        }

        return ans;
    }
}