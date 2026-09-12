class Solution {
    public String removeDuplicates(String s) {
        ArrayList<Character> list = new ArrayList<>();
        char[] ch = s.toCharArray();

        for(int i=0;i<s.length();i++){
            if(list.size()==0){
                list.add(ch[i]);
            }
            else if(list.get(list.size()-1)==ch[i]){
                list.remove(list.size()-1);
            }else{
                list.add(ch[i]);
            }
        }

        StringBuilder str = new StringBuilder();

for(char c : list) {
    str.append(c);
}

return str.toString();
        
    }
}