//https://leetcode.com/problems/binary-tree-inorder-traversal/
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        ArrayList<Integer> list = new ArrayList();
        
        Stack<TreeNode> s = new Stack();
        TreeNode curr = root;
        
        while(curr!=null || !s.isEmpty()){
            while(curr != null){
                s.push(curr);
                curr= curr.left;
            }
            
            curr = s.pop();
            list.add(curr.val);
            curr = curr.right;            
            
        }
        return list;
    }
}