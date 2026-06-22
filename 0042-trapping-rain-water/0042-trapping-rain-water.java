class Solution {
    public int trap(int[] height) {
        int l_max[]=new int[height.length];
        int r_max[]=new int[height.length];
        int total_water=0;
        int l=1,r=height.length-2;
        l_max[0]=height[0];
        r_max[r_max.length-1]=height[height.length-1];
        while(l<height.length)
        {
            l_max[l]=Math.max(l_max[l-1],height[l]);
            r_max[r]=Math.max(r_max[r+1],height[r]);
            l++;
            r--;
        }

        for(int i=0;i<height.length;i++)
        {
            int water=Math.min(l_max[i],r_max[i])-height[i];
    
   
                total_water+=water;
           
        }
        return total_water;
    }
}