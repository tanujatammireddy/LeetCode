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
    int total = 0;
    public int sumNumbers(TreeNode root) {
        if(root != null)
            dfs(root,0);
        return total;
    }
    public void dfs(TreeNode root,int sum){
        
        sum = sum*10 + root.val;
        
        if(root.left == null && root.right == null)
         total = total + sum;
        
        else{
            if(root.left != null)
                dfs(root.left,sum);
            if(root.right != null)
                dfs(root.right,sum);
        }
        
    }
}