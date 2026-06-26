class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0,cnt2=0;
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        List<Integer> list=new ArrayList<>();
        for(int x:nums){
            if (x==el1){
                cnt1++;
            }
            else if(x==el2){
                cnt2++;
            }
            else if(cnt1==0 && x!=el2){
                cnt1=1;
                el1=x;
            }
            else if((cnt2==0 && x!=el1)){
                el2=x;
                cnt2=1;
            }
            else{
                cnt2--;
                cnt1--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int x:nums){
            if(x==el1){
                cnt1++;
            }
            if(x==el2) {
                cnt2++;
            }
        }
        if(cnt1>nums.length/3){
        list.add(el1);
        }
        if(cnt2>nums.length/3){
        list.add(el2);
        }
        return list;
    }
}