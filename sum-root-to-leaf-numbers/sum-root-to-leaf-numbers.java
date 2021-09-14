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
    public int sum = 0;
    public int sumNumbers(TreeNode root) {
        if(root == null) 
            return 0;
        
        dfs(root,0);
        
        return sum;
    }
    public void dfs(TreeNode root, int current_sum){
        
        current_sum = current_sum*10 + root.val;
        
        if(root.left ==  null && root.right == null )
            sum += current_sum;
        
        if(root.left != null)
            dfs(root.left,current_sum);
        
        if(root.right != null)
            dfs(root.right,current_sum);
    }
}