import java.util.ArrayList;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums2) {
        list.add(num);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int nums:nums1){
            if(list.contains(nums)){
                ans.add(nums);
                while(list.contains(nums)){
                list.remove(Integer.valueOf(nums));
                }
            }
        }

        int result[] = new int[ans.size()];

        for(int i=0;i<ans.size();i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}