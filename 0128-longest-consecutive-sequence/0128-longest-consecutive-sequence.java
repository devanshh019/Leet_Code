class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set=new HashSet<>();
       int count=1,max=1;
       if(nums.length<1) return 0;
       for(int x:nums){
        set.add(x);
       }

       for(int x:set){

        if(!set.contains(x-1)){
            int curr=x;
            count=1;
        while(set.contains(curr+1)){
            count++;
            curr++;
        }
    }
    max=Math.max(max,count);
       }
        return max;
    }
}