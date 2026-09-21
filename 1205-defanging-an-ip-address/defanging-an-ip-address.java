class Solution {
    public String defangIPaddr(String s) {

        StringBuffer sb = new StringBuffer();
        char[] ch = s.toCharArray();

        for(int i=0;i<s.length();i++){
            if(ch[i] == '.'){
                sb.append("[.]");
            }else{
                sb.append(ch[i]);
            }
           
        }

        return sb.toString();
    }
}