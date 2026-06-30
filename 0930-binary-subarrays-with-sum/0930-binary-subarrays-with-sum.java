class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int curr=0;
        int count=0;
        map.put(0,1);
        for(int x:nums){
            curr+=x;
            int rem=curr-goal;

            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            
        }
        return count;
    }
}