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
        
        if(root!= null) return dfs(root,0,targetSum);
        
        return false;
        
    }
    
    public boolean dfs(TreeNode root, int sum, int targetSum){
        
        int current = root.val;
        current += sum;
        
        if(root.left == null && root.right == null) {
            if(current == targetSum)
            return true;
        }
        if(root.left != null){
            if(dfs(root.left,current,targetSum))
                return true;
        }
        if(root.right != null){
            if(dfs(root.right,current,targetSum))
                return true;
        }
        
        return false;
        
    }
}