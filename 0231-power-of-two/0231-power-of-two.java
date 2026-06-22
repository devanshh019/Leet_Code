class Solution {
    public boolean isPowerOfTwo(int n) {
        //bit wise n&(n-1)
        if(n>0 && ((n&(n-1))==0)) return true;
        else return false;
    }
}