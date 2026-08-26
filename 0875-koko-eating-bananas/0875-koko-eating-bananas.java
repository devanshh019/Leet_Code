class Solution {
    public double time(int [] arr,int speed){
        double total=0;
        for(int i:arr){
            total+=(int)Math.ceil((double)i/speed);
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        int ans=Integer.MAX_VALUE;
        for(int x:piles){
            max=Math.max(x,max);
        }
        //BS -> we have the range 1 to max(arr)

        int low=1,high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            double hr=time(piles,mid);
            if(hr<=h){
                ans=Math.min(ans,mid);
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return ans;
    }
}