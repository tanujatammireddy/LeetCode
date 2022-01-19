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
    
    public List<List<Integer>> findLeaves(TreeNode root) {
        
        List<List<Integer>> leafNodes = new ArrayList();
        
        if(root != null)
            helper(root,leafNodes);
        
        return leafNodes;
        
    }
    
    public int helper(TreeNode root, List<List<Integer>> leafNodes){
        
        int depth = 0;
        if(root.left == null && root.right == null){
        }
        else{
            int depth_left = 0;
            int depth_right = 0;
            if(root.left != null){
                depth_left = helper(root.left,leafNodes);
            } 
            if(root.right != null){
                depth_right = helper(root.right,leafNodes);
            }
            depth = Math.max(depth_left,depth_right)+1  ;
        }
        
        if(leafNodes.size() <= depth)
                leafNodes.add(new ArrayList());
        
         leafNodes.get(depth).add(root.val);
        
        return depth;
            
    }
}