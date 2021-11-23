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
    List<Integer> list;
    public int closestValue(TreeNode root, double target) {
        
        list = new ArrayList();
        if(root != null)
            traversal(root);
        
        double min = Integer.MAX_VALUE;
        int value = -1;
        for(int num:list){
            double diff = Math.abs((double)num-target);
            if(diff < min){
                value = num;
                min = diff;
            }
            
        }
        
        return value;
            
        
    }
    public void traversal(TreeNode root){
        
        if(root.left != null)
            traversal(root.left);
        
        list.add(root.val);
        
        if(root.right != null)
            traversal(root.right);
        
    }
}