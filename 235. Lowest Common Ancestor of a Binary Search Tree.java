//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int high,low;
        if(p.val<q.val){
            low = p.val;
            high = q.val;
        }else{
            high = p.val;
            low = q.val;
        }
        
        return BFS(root, low, high);
    }
    
    private TreeNode BFS(TreeNode root, int low, int high){
       
        if(root==null || ( root!=null && (root.val==low || root.val==high))) return root;
        if(root.val<low && root.val>high) return null;
           
        
        TreeNode left = BFS(root.left, low, high);
        TreeNode right = BFS(root.right, low, high);
           
        TreeNode ans = left!=null? right !=null? root: left: right;
        
        return ans;
    }
}