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
        
        List<List<Integer>> leavesList = new ArrayList();
        
        if(root != null)
            helper(root,leavesList);
        
        return leavesList;
        
    }
    
    public int helper(TreeNode root,List<List<Integer>> leavesList){
        
        int depth = -1;
        if(root.left == null && root.right == null){
            depth = 0;
        }
        else{
            
            int left_depth = 0;
            int right_depth = 0;
            if(root.left != null){
                left_depth = helper(root.left,leavesList);
            }
            if(root.right != null){
                right_depth = helper(root.right,leavesList);
            }
            
            depth = Math.max(left_depth,right_depth) + 1;
            
        }
        
        if(leavesList.size() <= depth)
        {
           leavesList.add(new ArrayList());
        }
        leavesList.get(depth).add(root.val);
        return depth;  
        
    }
}