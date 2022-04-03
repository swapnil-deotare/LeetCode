class Solution {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        List<Boolean> ans = new ArrayList<>(); 
        
        int[][] cnt = new int[s.length() + 1][26];
        
        for (int i = 0; i < s.length(); ++i) {
            
            cnt[i + 1] = cnt[i].clone(); // copy previous sum.
            
            cnt[i + 1][s.charAt(i) - 'a']++;
            
        }
        for (int[] q : queries) {
            int sum = 0; 
            for (int i = 0; i < 26; ++i) {
                sum += (cnt[q[1] + 1][i] - cnt[q[0]][i]) % 2;
            }
            ans.add(sum / 2 <= q[2]);
        }
       
        return ans;
    }
}
/*
According to the description and examples, we can deduce that the rearrange implies the input string s can be changed to any sequence to get close to a palindrome. Here close means least times of replacement of chars needed to become a palindrome after rearranging of s.

Obviously, any two same chars can be rearranged to be symmetric part of a palindrome, only the odd count of the chars we need to care. Therefore, when looping through the String s, we need to know if the count of each char in any prefix of the stirng s is odd or not by computing the corrsponding prefix sum, then the same information can be obtained for substring between any two given indices i and j by prefixSum[j] - prefixSum[i].
Sum those chars with odd number of occurrences, and we only need to replace half of them to make all in symmetric pairs.

e.g.,

If we want to make palindrome from s = "abbcccddddeeeee":
In "abbcccddddeeeee", a, b, c, d, and e occur 1, 2, 3, 4, and 5 times, respectively. Among them, a, c and e occur 1, 3, and 5 times.

We can easily rearrange 2 b's, 2c's, 4 d's and 4 e's to a palindrome: bcddeeeeddcb. Now only odd number occurrence chars a, c, and e remaining, and we can place 1 of them, say, e, to the center of the palindrome, and replace either a to c, or c to a to complete the conversion of s to a palindrome: c -> a: abcddeeeeeddcba or a -> c: bccddeeeeddccb.

In short, at least need 3 / 2 = 1 replacement: 3 odd number occurrence of chars a, c, and e divide by 2 equals to 1

Here is the brief description of my algorithm:

Compute the prefix sum by counting the number of chars in substring(0,1), substring(0, 2), ..., substring(0,n);
Use the difference of the prefix sums to get the the number of chars in substring(queries[i][0], queries[i][1]), count those do NOT in symmetric pairs, divided by 2, and compare it with queries[i][2].
*/