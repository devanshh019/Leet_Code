class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> ans =new ArrayList<>();
        for(int x:nums){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        }

        for(int x:map.keySet()){
            if(!(map.get(x)>1 || (map.containsKey(x-1)|| map.containsKey(x+1)))){
                ans.add(x);
            }
        }
        return ans;
    }
}