class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans=new ArrayList<>();
        String s="123456789";
        int min=String.valueOf(low).length();
        int max=String.valueOf(high).length();

        for(int i=min;i<=max;i++){
            int left=0,right=i-1;
            while(right<s.length()){
                int value=Integer.parseInt(s.substring(left,right+1));
                if(value>=low && value<=high) {
                    ans.add(value);
                }
                right++;
                left++;
            }
        }

        return ans;
    }
}