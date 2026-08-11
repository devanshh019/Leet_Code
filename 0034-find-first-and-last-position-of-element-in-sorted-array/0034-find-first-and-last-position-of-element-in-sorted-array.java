class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1,last=-1;

        int low=0,high=nums.length-1;

        while(low<=high){ //first
            int mid = low+(high-low)/2;

            if(nums[mid]==target){
                high=mid-1;
                first=mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        low=0;
        high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==target){
                low=mid+1;
                last=mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        int ans[]={first,last};
        return ans;
    }
}