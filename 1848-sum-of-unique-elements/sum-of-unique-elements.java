class Solution {
    public int sumOfUnique(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        int sum = 0;

        while(list.size() != 0) {
            int a = list.size() - 1;
            int b = list.get(a);
            list.remove(a);

            if(!list.contains(b)) {
                sum += b;
            } else {
                list.remove(Integer.valueOf(b));

                while(list.contains(b)) {
                    list.remove(Integer.valueOf(b));
                }
            }
        }

        return sum;
    }
}