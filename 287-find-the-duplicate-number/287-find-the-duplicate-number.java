class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer>  map= new HashMap<>();
        for(int i =0; i<nums.length; i++){
            if(map.put(nums[i], i)!=null) return nums[i];
            else map.put(nums[i], i);
        }
        return 0;
    }
}