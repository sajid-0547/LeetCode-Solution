class Solution {
    public boolean backspaceCompare(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for(int i=0;i<t.length();i++){
            if(t.charAt(i) == '#'){
                if(st1.size() != 0){
                st1.pop();
                }
            }else{
                st1.push(t.charAt(i));
            }
        }

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '#'){
                if(st2.size() != 0){
                st2.pop();
                }
            }else{
                st2.push(s.charAt(i));
            }
        }


        return st1.equals(st2);

    }
}