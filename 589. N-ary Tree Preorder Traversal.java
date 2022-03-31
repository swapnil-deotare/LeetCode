class Solution {
    public List<Integer> preorder(Node root) {
       List<Integer> list = new ArrayList<>();
       if(root != null) {
           DFS(root, list);
        }
        return list;
}

public void DFS(Node node, List<Integer> list){
   
       list.add(node.val);
       if (node.children.isEmpty()) {
           return;
       }
       for (Node childNode : node.children) {
           DFS(childNode, list);
       }
   
   }
} 