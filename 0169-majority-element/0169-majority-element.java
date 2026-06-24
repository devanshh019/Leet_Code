class Solution {
    public int majorityElement(int[] nums) {
        int candidate=nums[0];
        int vote=1;
        for(int i=1;i<nums.length;i++){
            if(candidate==nums[i])
            {
                vote++;
            }
            else if(vote==0){
                candidate=nums[i];
            }
            else{
                vote--;
            }
        }
        return candidate;
    }
}