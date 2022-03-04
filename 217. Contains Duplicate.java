//https://leetcode.com/problems/contains-duplicate/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> set = new HashSet();
        
        int size = 0;
        
        for (int i=0; i<nums.length; i++){
            
            set.add(nums[i]);
            
            if(set.size()!= i+1){
                return true; //stops iterating when duplicate element is found 
                //complexity worst case O(n), average case O(k) : K being index of duplicate number, 
            }
            
        }
        return false;// no duplicates found
        
    }
}