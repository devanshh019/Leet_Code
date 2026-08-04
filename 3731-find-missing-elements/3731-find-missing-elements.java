class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        HashSet<Integer> set=new HashSet<>();
        for(int i :nums){
            set.add(i);
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        List<Integer> ans=new ArrayList<>();
        for(int j=min+1;j<max;j++){
            if(!set.contains(j)) ans.add(j);
        }

        return ans;
    }
}