class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count = 0;
        int result = 0;
        
        for(int i = 0; i<nums.length; i++) {
            
            if(nums[i]==1){
                count++;
                // result = Math.max(result, count); what I did initially, resulting in a 2ms solution
            }
            else count = 0;
            if(count > result) result = count; // resulting in a 1ms solution. 100% faster
        }
        
        return result;
    }
}