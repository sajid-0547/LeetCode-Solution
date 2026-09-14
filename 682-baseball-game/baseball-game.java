class Solution {
    public int calPoints(String[] arr) {
        int n = arr.length;
        Stack<String> st = new Stack<>();

        for(int i=0;i<n;i++){
            if(arr[i].equals("C")) st.pop();

            else if(arr[i].equals("D")){
                int x = Integer.parseInt(st.peek())*2;
                st.push(Integer.toString(x));
            }else if(arr[i].equals("+")){
                int temp1 = Integer.parseInt(st.peek());
                st.pop();
                int temp2 = Integer.parseInt(st.peek());
                int add = temp1+temp2;
                st.push(Integer.toString(temp1));
                st.push(Integer.toString(add));       
            }else{
                st.push(arr[i]);
            }
        }

        int ans = 0;
        while(st.size() != 0){
            ans = ans+Integer.parseInt(st.peek());
            st.pop();
        }

    return ans;
    }
}