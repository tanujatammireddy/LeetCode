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
     return valid(root,null,null);
    }
    public boolean valid(TreeNode root, Integer lowerlimit,Integer upperlimit){
        if(root == null)
            return true;
        
        if ((lowerlimit != null && root.val<= lowerlimit) || (upperlimit != null && root.val >= upperlimit))
            return false;
        
        return valid(root.left,lowerlimit,root.val) && valid(root.right,root.val,upperlimit);
    }
    
}