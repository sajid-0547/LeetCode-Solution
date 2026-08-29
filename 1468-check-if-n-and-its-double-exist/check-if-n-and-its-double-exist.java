class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            set.put(arr[i],i);
        }

        for(int i=0;i<arr.length;i++){
            int a = 2*arr[i];
            if(set.containsKey(a) && i != set.get(a)){
                return true;
            }
        }
    return false;
        
    }
}