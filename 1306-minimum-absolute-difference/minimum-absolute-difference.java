class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> list = new ArrayList<>();
        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int d = arr[i + 1] - arr[i];

            if (d < diff) {
                diff = d;
                list.clear();
            }

            if (d == diff) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                list.add(pair);
            }
        }

        return list;
    }
}