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
        List<Pair<TreeNode,Integer>> nodes = new ArrayList();
        if(root != null)
            helper(root,nodes);
        
        for(Pair p: nodes){
            
            TreeNode current = (TreeNode) p.getKey();
            int depth = (Integer) p.getValue();
            
            if(leafNodes.size() <= depth)
                leafNodes.add(new ArrayList());
            
            leafNodes.get(depth).add(current.val);
        }
        
        return leafNodes;
        
    }
    
    public int helper(TreeNode root,List<Pair<TreeNode,Integer>> nodes){
        
        int depth = 0;
        if(root.left == null && root.right == null){
            nodes.add(new Pair(root,depth));
        }
        else{
            int depth_left = 0;
            int depth_right = 0;
            if(root.left != null){
                depth_left = helper(root.left,nodes);
            } 
            if(root.right != null){
                depth_right = helper(root.right,nodes);
            }
            depth = Math.max(depth_left,depth_right)+1  ;
            nodes.add(new Pair(root,depth));
        }
        
        return depth;
            
    }
}