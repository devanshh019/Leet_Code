class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxKadens=Integer.MIN_VALUE;
        int minKadens=Integer.MAX_VALUE;
        //min
        int sum=0;
        for(int i:nums){
            sum+=i;
            minKadens=Math.min(minKadens,sum);
            if(sum>0){
                sum=0;
            }
        }
        sum=0;
        for(int i:nums){
            sum+=i;
            maxKadens=Math.max(maxKadens,sum);
            if(sum<0){
                sum=0;
            }
        }
        //max
        sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(maxKadens<0) return maxKadens;
        int circ=sum-minKadens;
        return Math.max(circ,maxKadens);

    }
}