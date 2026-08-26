class Solution {
    public int findMin(int[] nums) {
        int l=0,h=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(l<=h){
            int m=l+(h-l)/2;

            if(nums[m]>=nums[l]){//left sorted
            //pick min from left
            ans=Math.min(nums[l],ans);
            l=m+1;
            } 
            else{
                ans=Math.min(nums[m],ans);
                h=m-1;
            }
        }
        return ans;
    }
}