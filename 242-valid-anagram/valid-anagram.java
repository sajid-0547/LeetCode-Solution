class Solution {
    public boolean isAnagram(String s, String t) {
        int r = 0;

        if(s.length() == t.length()){
           for(char ch: s.toCharArray()){
                if(t.contains(String.valueOf(ch))){
                    t = t.replaceFirst(String.valueOf(ch),"");
                }else{
                    return false;
                }
           }
        }else{
            return false;
        }

        return true;
        
    }
}