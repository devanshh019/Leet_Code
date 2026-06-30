class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        if(n<2) return 0;
        for(int i=0;i<n;i++){
            if(0==nums[i]){
                nums[i]=-1;
            }
        }

        int max_len=0;
        int curr=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            curr+=nums[i];
            if(map.containsKey(curr)){
                int l=i-map.get(curr);
                max_len=Math.max(max_len,l);
            }
            else{
                map.put(curr,i);
            }
        }
        return max_len;
    }
}