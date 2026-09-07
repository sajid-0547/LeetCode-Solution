class Solution {
    public char repeatedCharacter(String s) {
            HashSet<Character> map = new HashSet<>();

            for(int i=0;i<s.length()-1;i++){
                if(map.contains(s.charAt(i))){
                    return s.charAt(i);
                }else{
                    map.add(s.charAt(i));
                }
            }
            return s.charAt(s.length()-1);
        
    }
}