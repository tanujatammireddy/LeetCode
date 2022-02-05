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
    
    List<TreeNode> list = new ArrayList();
    
    public void flatten(TreeNode root) {
        
        if(root == null ||(root.left == null && root.right == null))
            return;
        
        //TreeNode temp = root;
        preOrder(root);
        
        TreeNode next = root;
        next.left = null;
        
        for(int i=1; i<list.size(); i++){
            
            TreeNode current = list.get(i);
            next.right = current;
            next = current;
            //System.out.println(current.val);
        }
        
        
        
    }
    
    public void preOrder(TreeNode root){
        
        TreeNode left = root.left;
        TreeNode right = root.right;
        list.add(root);
        root.left = null;
        root.right = null;
        if(left != null)
            preOrder(left);
        if(right != null)
            preOrder(right);
        
    }
    
    
}