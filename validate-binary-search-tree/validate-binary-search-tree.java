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

    public boolean isValidBST(TreeNode root) {
        if(root != null)
            return bfs(root,null,null);
        else
            return true;
    }
    
    public boolean bfs(TreeNode root, Integer lowerLimit, Integer upperLimit){
        
    boolean leftTree = true;
    boolean rightTree = true;
    
    if ((lowerLimit != null && root.val <= lowerLimit) || (upperLimit != null && root.val >= upperLimit))
        return false;
            
    if(root.left != null)
       leftTree = bfs(root.left,lowerLimit,root.val);
        
    if(root.right != null)
        rightTree = bfs(root.right,root.val,upperLimit);
        
        return (rightTree && leftTree);
        
    }
}