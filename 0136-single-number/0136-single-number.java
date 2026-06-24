class Solution {
    public int singleNumber(int[] nums) {
        int xor=0;
        //a^0=a a^a=0

        for(int num :nums){
            xor^=num;
        }
        return xor;
    }
}