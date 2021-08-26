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
    public int sum =0;
    public int sumNumbers(TreeNode root) {
        
        if(root!= null)
            parse(root,root.val);
        
        return sum;
            
    }
    public void parse(TreeNode root, int current){
        
        if(root.left == null && root.right == null)
            sum += current;
        else
        {
            if(root.left!= null)
                parse(root.left,current*10 + root.left.val);
            
            if(root.right != null)
                parse(root.right,current*10 + root.right.val);
            
        }
    }
}