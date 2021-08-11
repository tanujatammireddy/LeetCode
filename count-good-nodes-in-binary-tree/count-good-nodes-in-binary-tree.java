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
    public int count =0;
    public int goodNodes(TreeNode root) {
        int max = Integer.MIN_VALUE;
        if(root != null){
            traversal(root,max);
        }
        return count;
    }
    public void traversal(TreeNode root,int max){
        if(root.val >= max){
            this.count++;
        }
        if(root.left != null){
            traversal(root.left,Math.max(root.val,max));
        }
        if(root.right != null){
            traversal(root.right,Math.max(root.val,max));
        }
    
    }
}