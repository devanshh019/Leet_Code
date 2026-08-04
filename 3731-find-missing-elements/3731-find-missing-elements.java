class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        boolean arr[]=new boolean[100]; //false by default
        for (int i : nums) {
            arr[i-1]=true;
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = min + 1; j < max; j++) {
            if (!arr[j-1])
                ans.add(j);
        }

        return ans;
    }
}