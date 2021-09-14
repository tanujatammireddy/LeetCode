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
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
    
    if(root == null) return false;
    return dfs(root,0,targetSum);
        
    }
    
    public boolean dfs(TreeNode root, int sum, int targetSum){
        
        int currentSum = sum + root.val;
        
        if(root.left ==  null && root.right == null && targetSum == currentSum )
            return true;
        /*if(currentSum > targetSum )
            return false;*/
        if(root.left != null)
            if(dfs(root.left,currentSum,targetSum))
                return true;
        if(root.right != null)
            if(dfs(root.right,currentSum,targetSum))
                return true;
        
        return false;
    }
}