class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for(int i=2;i<nums.length;i++){
            int a = arr1.get(arr1.size()-1);
            int b = arr2.get(arr2.size()-1);
            if(a>b){
                arr1.add(nums[i]);
            }else{
                arr2.add(nums[i]);
            }
        }

        int[] ans = new int[nums.length];
        int i = 0;
        for(int x1 : arr1){
            ans[i] = x1;
            i++;
        }

        for(int x2 : arr2){
            ans[i] = x2;
            i++;
        }

        return ans;




    }
}