//https://leetcode.com/problems/missing-number/
class Solution {
    public int missingNumber(int[] nums) {
        int a = nums.length;
        for (int i =0;i<nums.length;i++) {
          a^=i^nums[i];
     }
        return a;
    }
}


class Solution {
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}

