class Solution {
    public int minimumPairRemoval(int[] nums) {

        int size = nums.length;
        int count = 0;

        while (true) {

            boolean sorted = true;

            for (int i = 0; i < size - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                return count;
            }

            int store = Integer.MAX_VALUE;
            int idx = 0;

            for (int i = 0; i < size - 1; i++) {
                int x = nums[i] + nums[i + 1];

                if (x < store) {
                    store = x;
                    idx = i;
                }
            }

            nums[idx] = nums[idx] + nums[idx + 1];

            for (int i = idx + 1; i < size - 1; i++) {
                nums[i] = nums[i + 1];
            }

            size--;
            count++;
        }
    }
}