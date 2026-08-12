class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0,Avg=Integer.MIN_VALUE;
        int end=k-1;
        int strt=0;
        for(int i=0;i<=end;i++){
            sum+=(double)nums[i];
        }
        Avg=Math.max(Avg,sum/k);
        while(end<nums.length-1){
            sum-=(double)nums[strt];
            strt++;
            end++;
            sum+=(double)nums[end];
            Avg=Math.max(Avg,sum/k);
        }
        return Avg;
    }
}