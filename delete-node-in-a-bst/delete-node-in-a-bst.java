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
    List<Integer> inOrderList ;
    public TreeNode deleteNode(TreeNode root, int key) {
        
        
        if (root == null) return null;
        
        if (key > root.val) 
            root.right = deleteNode(root.right, key);
        
        else if (key < root.val) 
            root.left = deleteNode(root.left, key);
        
        else {
          
            if (root.left == null && root.right == null) root = null;
      
            else if (root.right != null) {
                root.val = successor(root);
                root.right = deleteNode(root.right, root.val);
            }
            else {
                root.val = predecessor(root);
                root.left = deleteNode(root.left, root.val);
            }
        }
    return root;
  }
    
    public int successor(TreeNode root) {
        root = root.right;
        while (root.left != null) 
            root = root.left;
        return root.val;
    } 
    public int predecessor(TreeNode root) {
        root = root.left;
        while (root.right != null) 
            root = root.right;
        return root.val;
    } 
    public void inOrderTraversal(TreeNode root){
        
        if(root.left != null)
            inOrderTraversal(root.left);
        
        inOrderList.add(root.val);
        
        if(root.right != null)
            inOrderTraversal(root.right);
    }
}