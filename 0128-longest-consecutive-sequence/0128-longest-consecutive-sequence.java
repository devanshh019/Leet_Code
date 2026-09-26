class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int max=0;
        for (int x: set){
            int len=0;
            if(set.contains(x-1)){
                continue;
            }
            else{
                while(set.contains(x)){
                    len++;
                    x++;
                }
            }
            max=Math.max(max,len);
        }
        return max;
    }
}