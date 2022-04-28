//https://leetcode.com/problems/next-greater-element-i/
class Solution {
    
    //     Key observation:
    // Suppose we have a decreasing sequence followed by a greater number
    // For example [5, 4, 3, 2, 1, 6] then the greater number 6 is the next greater element for all previous numbers in the sequence
    
    // We use a stack to keep a decreasing sub-sequence, whenever we see a number x greater than stack.peek() we pop all elements less than x and for all the popped ones, their next greater element is x
    // For example [9, 8, 7, 3, 2, 1, 6]
    // The stack will first contain [9, 8, 7, 3, 2, 1] and then we see 6 which is greater than 1 so we pop 1 2 3 whose next greater element should be 6
        
        //https://leetcode.com/problems/next-greater-element-i/discuss/97595/Java-10-lines-linear-time-complexity-O(n)-with-explanation
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            
            
            
            Stack<Integer> stack = new Stack();
            
            Map<Integer,Integer> map = new HashMap();
            
            for(int i=0;i<nums2.length; i++){
                while(!stack.isEmpty() && stack.peek()<nums2[i]){
                    map.put(stack.pop(),nums2[i]);
                }
                
                stack.push(nums2[i]);
                
            }
            
            for (int i = 0; i < nums1.length; i++)
                nums1[i] = map.getOrDefault(nums1[i], -1);
            return nums1;
        }
    }