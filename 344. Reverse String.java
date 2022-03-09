//https://leetcode.com/problems/reverse-string/
class Solution {
    public void reverseString(char[] s) {
        
        
        if(s!=null && s.length > 1)
            
        
        for(int i=0; i<s.length/2; i++){
            
            char temp = s[s.length-1-i];
            s[s.length-1-i]=  s[i];
            s[i] = temp;
            
        }
        
    }
}