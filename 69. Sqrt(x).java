//https://leetcode.com/problems/sqrtx/
class Solution {
    public int mySqrt(int x) {
      if (x < 2) return x;
  
      long num;
      int pivot, left = 2, right = x / 2;
      while (left <= right) {
        pivot = left + (right - left) / 2;
        num = (long)pivot * pivot;
        if (num > x) right = pivot - 1;
        else if (num < x) left = pivot + 1;
        else return pivot;
      }
  
      return right;
    }
  }
  
  // We know that for x >= 2, Sqrt(x) <= x/2.
  
  // The loop maintains the invariant left <= Sqrt(x) <= right and we continue looping while left <= right. 
  //For the loop to stop we must have left > right. Given we move left and right by one at each iteration it 
  //must be that at the previous iteration we had left == right and we moved left by 1 to get left > right.
  //Given the invariant that implies that at the previous iteration we had left == Sqrt(x) == right. So we need to return right