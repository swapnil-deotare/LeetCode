// /https://leetcode.com/problems/plus-one/
class Solution {
    public int[] plusOne(int[] digits) {
        
        if(digits[digits.length-1]!=9){
           digits[digits.length-1]+=1;
            return digits;
        }
        
        
        int i= digits.length-2;
        
        digits[digits.length-1]=0;
        while(i>=0 && digits[i]==9){
        
            digits[i]=0;
            i--;
            
        
        }
        
        
        if(i<0){
            int[] newArray= new int[digits.length+1];
            newArray[0]=1;
            return newArray;
        }else{
            digits[i]=digits[i]+1;
            
            return digits;
        }
        
        
    }
}