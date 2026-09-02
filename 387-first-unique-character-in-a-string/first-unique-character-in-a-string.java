class Solution {
    public int firstUniqChar(String s) {
       
       LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

       for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
       }

        char store = ':';
       for(Character ch:map.keySet()){
        if(map.get(ch) == 1){
            store = ch;
            break;
        }
       }

       for(int i=0;i<s.length();i++){
        if(s.charAt(i) == store){
            return i;
        }
       }

       return -1;
        
    }
}