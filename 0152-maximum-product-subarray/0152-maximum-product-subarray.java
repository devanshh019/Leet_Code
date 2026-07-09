class Solution {
    public int maxProduct(int[] nums) {
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        int prod1=1,prod2=1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            prod1*=nums[i];
            prod2*=nums[n-i-1];

            

            max1=Math.max(max1,prod1);
            max2=Math.max(max2,prod2);
            if(prod1==0) prod1=1;
            if(prod2==0) prod2=1;
        }
        return Math.max(max1,max2);
    }
}