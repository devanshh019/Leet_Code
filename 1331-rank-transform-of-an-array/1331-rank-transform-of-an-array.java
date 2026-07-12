class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);

        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;
        for (int x : clone) {
            if (!map.containsKey(x)) {
                map.put(x, rank++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}