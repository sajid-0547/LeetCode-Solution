class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int top1 = st.peek();
                st.pop();
                int top2 = st.peek();
                st.pop();
                int temp = top2+top1;
                st.push(temp);
            }
            else if(tokens[i].equals("-")){
                int top1 = st.peek();
                st.pop();
                int top2 = st.peek();
                st.pop();
                int temp = top2-top1;
                st.push(temp);
            }
            else if(tokens[i].equals("*")){
                int top1 = st.peek();
                st.pop();
                int top2 = st.peek();
                st.pop();
                int temp = top2*top1;
                st.push(temp);
            }
            else if(tokens[i].equals("/")){
                int top1 = st.peek();
                st.pop();
                int top2 = st.peek();
                st.pop();
                int temp = top2/top1;
                st.push(temp);
            }else{
                int temp1 = Integer.parseInt(tokens[i]);
                st.push(temp1);
            }
        }


        return st.peek();
    }
}