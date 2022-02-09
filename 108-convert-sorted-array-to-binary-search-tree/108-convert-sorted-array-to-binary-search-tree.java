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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
            return null;
        
        return helper(nums,0,nums.length-1);
    }
    
    public TreeNode helper(int[] nums,int front, int rear){
        
        //System.out.println("front"+front+" rear"+rear);
        if(rear < front)
            return null;
        
        int mid = (front+rear)/2;
        
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums,front,mid-1);
        root.right = helper(nums,mid+1,rear);
        
        return root;
        
    }
}