class Solution {
    public int div_n_sum(int [] arr,int div){
        int ans=0;
        for(int x:arr){
            ans+=(int)Math.ceil((double)x/div);
        }
        return ans;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int x:nums){
            max=Math.max(max,x);
        }
        int low=1,high=max;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;

            int curr_div=div_n_sum(nums,mid);

            if(curr_div<=threshold){
                ans=Math.min(mid,ans);
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}