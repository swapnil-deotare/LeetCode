class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0, j=0, max=0;
        HashSet<Character> set = new HashSet();
        
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                max = Math.max((j-i)+1,max);
                set.add(s.charAt(j++));
            }else{
                set.remove(s.charAt(i++));
            }    
        }
        return max;
    }
}