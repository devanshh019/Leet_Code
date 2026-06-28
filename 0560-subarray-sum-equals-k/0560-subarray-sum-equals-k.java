class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]+nums[i];
        }
        int count=0;
        for(int start=0;start<n;start++)
        {
            for(int end=start;end<n;end++)
            {
                int ans=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(ans==k) count++;
            }
        }
        return count;
    }
}