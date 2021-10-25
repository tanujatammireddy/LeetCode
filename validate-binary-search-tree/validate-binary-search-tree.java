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
        
      return isValid(root,null, null) ;
        
    }
    public boolean isValid(TreeNode root,Integer lowerLimit, Integer upperLimit){
        
        if(root == null) return true; 
    
        int value = root.val;
        
        if((lowerLimit != null && value <= lowerLimit) || (upperLimit != null && value >= upperLimit ))
            return false;
            
        return isValid(root.left,lowerLimit,value) && isValid(root.right,value,upperLimit);
        
    }
}