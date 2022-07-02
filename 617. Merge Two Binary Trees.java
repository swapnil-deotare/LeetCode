class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        //return node which is not null
        if(root1 == null) return root2;
        if(root2 == null) return root1;
        
        //add the value to the first tree, here we are not checking if root1!=null as it is already checked above
        root1.val = root1.val + root2.val;
        
        //recursion - works like magic
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }
    
   
}