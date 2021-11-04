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
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root,false,false);
        return sum;
    }
    
    public void dfs(TreeNode root, boolean isLeft, boolean isRight){
        
        if(root.left == null && root.right == null && isLeft )
            sum = sum + root.val;
        
        if(root.left != null)
            dfs(root.left,true,false);
        if(root.right != null)
            dfs(root.right,false,true);
        
    }
}