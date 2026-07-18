class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};

        int l=0,h=nums.length-1;

        while(l<=h){
            int mid=(l+h)/2;

            if(nums[mid]==target){
                int left=mid,right=mid;
                while(left>=0 && nums[left]==target) left--;
                while(right<nums.length&&nums[right]==target) right++;

                ans[0]=left+1;
                ans[1]=right-1;

                break;
            }
            else if(nums[mid]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }

        return ans;
    }
}