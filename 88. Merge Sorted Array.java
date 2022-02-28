//https://leetcode.com/problems/merge-sorted-array/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
        //inspired from popular solution on discussion page
        
        //counter index values from behind
        int ctr = m + n -1;
        //decrementing m and n to match array indexing.
        m--;
        n--;
        
        while(m>=0 && n>=0){
        
            //adding values from right side and decrementing ctr, m and n respectively
            if(nums1[m] >= nums2[n]){
                nums1[ctr--] = nums1[m--];
            }else if(nums2[n] > nums1[m]){
                 nums1[ctr--] = nums2[n--];
            }
        }
        //adding the elements from nums2 if remaining.
        while (n>=0){
            nums1[ctr--] = nums2[n--];
        }
    }
}