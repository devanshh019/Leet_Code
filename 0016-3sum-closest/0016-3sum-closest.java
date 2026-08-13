class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int ans=-1;
        for(int i=0;i<nums.length;i++){ //first index fixed

        int left=i+1,right=nums.length-1; //two pointer

        while(left<right){
            int sum=nums[i]+nums[left]+nums[right];

            int diff_target=Math.abs(sum-target);

            if(diff_target<min){
                min=diff_target;
                ans=sum;
            }

            if(sum>target){
                right--;
            }
            else if(sum<target){
                left++;
            }
            else{
                return ans;
            }
        }

        }
        return ans;
    }
}