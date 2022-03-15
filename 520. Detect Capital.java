//https://leetcode.com/problems/detect-capital/
class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        if (n == 1) {
            return true;
        }

        // case 1: All capital
        if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
            for (int i = 2; i < n; i++) {
                if (Character.isLowerCase(word.charAt(i))) {
                    return false;
                }
            }
        // case 2 and case 3
        } else {
            for (int i = 1; i < n; i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        }

        // if pass one of the cases
        return true;
    }
}

// public boolean detectCapitalUse(String word) {
//         boolean lowCap = false, allCap =false;
//         boolean valid =true;
        
//         boolean isFirstLetCap= word.charAt(0)>64 && word.charAt(0)<91 ? true:false;
        
//         for(int i=1;i<word.length();i++){
        
//             if(!lowCap && word.charAt(i) >64 && word.charAt(i)<91){
//                 valid=true;
//                 allCap=true;
//             }else if(!allCap && word.charAt(i) >96 && word.charAt(i)<123){
//                 valid=true;
//                 lowCap=true;
//             }else{
//                 return false;
//             }
//         }
        
//         if(allCap) return isFirstLetCap&&valid;
//         return valid;
        
//     }