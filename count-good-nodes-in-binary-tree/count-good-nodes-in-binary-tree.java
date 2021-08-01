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
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        traversal(root,Integer.MIN_VALUE);
        return count;
    }
    public void traversal(TreeNode node, int max){
        if(node.val >= max){
            this.count++;
            max = Math.max(node.val,max);
        }
        if(node.left != null){
            traversal(node.left, max);
        }
        if(node.right!=null){
            traversal(node.right, max);
        }
    }
}