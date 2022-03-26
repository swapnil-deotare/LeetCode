// class Solution {
//   // Time Complexity: O(n); Space Complexity: O(n)
//   public int lengthOfLongestSubstring(String s) {

//     /**
//      * Recording all visited chars
//      * @param Character - the char visited
//      * @param Integer - last index of the visited char
//      */
//     HashMap<Character, Integer> charRecorderMap = new HashMap<Character, Integer>();

//     int maxNonDuplicateSubstringLength = 0;
//     int newSubstringStartPos = 0;
//     int lenString = s.length();
    
//     for (int currentPos = 0; currentPos < lenString; currentPos++) {

//       // luckily, String.charAt(N) takes O(1) in Time Complexity
//       char theChar = s.charAt(currentPos);

//       if (charRecorderMap.containsKey(theChar)) {
//         // newSubstringStartPos is indeed the last occurrence of the same char + 1
//         // say, for string "abbac",
//         // when
//         // - `currentPos` == 0, theChar == "a", charRecorderMap.containsKey(theChar) == false, `newSubstringStartPos` == 0; 
//         // - `currentPos` == 1, theChar == "b", charRecorderMap.containsKey(theChar) == false, `newSubstringStartPos` == 0; 
//         // - `currentPos` == 2, theChar == "b", charRecorderMap.containsKey(theChar) == true,  `newSubstringStartPos` == 2;
//         //    charRecorderMap.get(theChar) == 1;
//         // that means, if we found any char (say, "b") is duplicated, 
//         // we should reset the substring start position to the position right after the duplicated char (+1)

//         // - `currentPos` == 3, theChar == "a", charRecorderMap.containsKey(theChar) == true,  `newSubstringStartPos` == 2;
//         //    charRecorderMap.get(theChar) == 0;
//         //    charRecorderMap.get(theChar) + 1 < newSubstringStartPos // charRecorderMap.get(theChar)  is actually the first "a", which is at pos 0;

//         // That is to say, we should always set `newSubstringStartPos` to the rightmost position of any duplicated chars
//         newSubstringStartPos = Math.max(newSubstringStartPos, charRecorderMap.get(theChar) + 1);
//       }

//       // Why `currentPos - newSubstringStartPos + 1`? 
//       // Well, `currentPos - newSubstringStartPos` is the diff of start pos and end pos of the current substring
//       // `+ 1` is because we should add 1 to the diff. Say for substring "ab", "a" is at pos 0, "b" is at pos 1, 
//       // the diff is 1, but the count of the total string length is 2.
//       maxNonDuplicateSubstringLength = Math.max(maxNonDuplicateSubstringLength, currentPos - newSubstringStartPos + 1);

//       charRecorderMap.put(theChar, currentPos);
//     }

//     return maxNonDuplicateSubstringLength;
//   }
// }



class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return max;
    }
}