import java.util.ArrayList;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num1:nums1){
            list.add(num1);
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        for(int num2:nums2){
            if(list.contains(num2)){
                list2.add(num2);
                list.remove(Integer.valueOf(num2));
            }
        }

        int arr[] = new int[list2.size()];

        for(int i=0;i<list2.size();i++){
            arr[i] = list2.get(i);
        }
        return arr;
        
    }
}