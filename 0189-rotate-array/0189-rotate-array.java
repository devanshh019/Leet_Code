class Solution {
    public void rotate(int[] nums, int k) {
        int ans[]=new int[nums.length];
        int n=nums.length;
        k=k%n;
        int ind=0;
        for(int i=n-k;i<n;i++)
        {
            ans[ind]=nums[i];
            ind++;
        }
        for(int i=0;i<n-k;i++)
        {
            ans[ind]=nums[i];
            ind++;
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=ans[i];
        }
    }
}