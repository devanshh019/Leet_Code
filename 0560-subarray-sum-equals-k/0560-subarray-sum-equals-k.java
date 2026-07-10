class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int curr=0;
        map.put(0,1);
        for(int x: nums){
            curr+=x;
            int rem=curr-k;
            if(map.containsKey(rem)) count+=map.get(rem);

            map.put(curr,map.getOrDefault(curr,0)+1);

        }
        return count;
    }
}