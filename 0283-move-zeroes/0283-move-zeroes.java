class Solution {
    public void moveZeroes(int[] arr) {
        int i=-1,n=arr.length;
        //find first 0
        for(int j=0;j<n;j++){
            if(arr[j]==0){
                i=j;
                break;
            }
        }
        //if no 0 found end funcn
        if(i==-1) return;

        //after 1st zero check for non zero and swap
        for(int j=i+1;j<n;j++){
            if(arr[j]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }
        }

    }
}