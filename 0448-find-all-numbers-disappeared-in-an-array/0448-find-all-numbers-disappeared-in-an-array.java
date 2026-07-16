class Solution {

    public void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public List<Integer> findDisappearedNumbers(int[] nums) {
        //cycle sort ->best / optimal
        //hashmap -> space O(n)

        int i=0,n=nums.length;
        List<Integer> ans= new ArrayList<>();
        while(i<n){
            int corr_ind=nums[i]-1;
            if(nums[i]!=nums[corr_ind]){
                swap(nums,i,corr_ind);
            }
            else{
                i++;
            }
        }

        for(int x=0;x<n;x++){
            if(nums[x]-1!=x){
                ans.add(x+1);
            }
        }

        return ans;
    }
}