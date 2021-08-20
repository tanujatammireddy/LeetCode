/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> returnList = new ArrayList();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root != null)
        traversal(root);
        return returnList;
    }
    public void traversal(TreeNode root){
        if(root.left != null)
            traversal(root.left);
        if(root != null)
            returnList.add(root.val);
         if(root.right != null)
            traversal(root.right);
       
    }
        
}