class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int curr=0;
        map.put(0,1);
        for(int x:nums){
            curr+=x;
            int rem=curr%k;
            rem+=rem<0? k:0;
            if(map.containsKey(rem)){
                 count+=map.get(rem);
                 map.put(rem,map.get(rem)+1);
            }
            else{
                map.put(rem,1);
            }
        }
        return count;
    }
}