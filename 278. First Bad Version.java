/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
//https://leetcode.com/problems/first-bad-version/
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
       
        int start=1;
        int end = n;
        
        int mid = -1;
        
        
        while(start<=end){
            mid = start + (end-start)/2;
            boolean validMid = isBadVersion(mid);
            
            if(validMid && !isBadVersion(mid-1))
                return mid;
            // else if(!validMid && isBadVersion(mid-1))
            //       return mid;
            if(validMid)
                end = mid -1;
            else
                start = mid + 1;
        }
        return  mid;
    }
}