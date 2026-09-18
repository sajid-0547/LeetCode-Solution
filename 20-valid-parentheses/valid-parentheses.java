class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        char[] ch = s.toCharArray();

        for(int i=0;i<s.length();i++){
            if(st.size()!=0 && st.peek()=='(' && ch[i]==')'){
                st.pop();
            }
            else if(st.size()!=0 && st.peek()=='{' && ch[i]=='}'){
                st.pop();
            }
            else if(st.size()!=0 && st.peek()=='[' && ch[i]==']'){
                st.pop();
            }else{
                st.push(ch[i]);
            }
        }

        if(st.size() == 0){
            return true;
        }


        return false;
    }
}