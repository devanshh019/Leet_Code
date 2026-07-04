class Solution {

    public List<Integer> nthRow(int n) {
        List<Integer> nth = new ArrayList<>();
        nth.add(1);
        int res = 1;
        for (int i = 1; i < n; i++) {
            res *= n - i;
            res /= i;
            nth.add(res);
        }
        return nth;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            ans.add(nthRow(i));
        }

        return ans;
    }
}