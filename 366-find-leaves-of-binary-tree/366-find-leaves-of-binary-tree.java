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
    
    List<List<Integer>> leaves;
    public List<List<Integer>> findLeaves(TreeNode root) {
        
        leaves = new ArrayList();
        if(root != null)
            helper(root);
        
        return leaves;
            
    }
    
    public int helper(TreeNode root){
        
        int depth ;
        int left = 0;
        int right = 0;
        if(root.left == null && root.right == null){
             depth = 0;
        }
        else
        {
            if(root.left != null)
                left = helper(root.left);
            if(root.right != null)
                right = helper(root.right);
            
            depth = Math.max(left,right)+1;
        }
        if(leaves.size() == depth)
            leaves.add(new ArrayList());
        leaves.get(depth).add(root.val);
        
        return depth;
    }
}