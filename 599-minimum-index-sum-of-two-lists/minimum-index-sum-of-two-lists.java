class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {

                if (list1[i].equals(list2[j])) {
                    int temp = i + j;
                    map.put(list1[i], temp);
                }
            }
        }

        int num = Integer.MAX_VALUE;
        ArrayList<String> ans = new ArrayList<>();

        for (String key : map.keySet()) {

            if (map.get(key) < num) {
                num = map.get(key);
                ans.clear();
                ans.add(key);
            } 
            else if (map.get(key) == num) {
                ans.add(key);
            }
        }

        return ans.toArray(new String[0]);
    }
}