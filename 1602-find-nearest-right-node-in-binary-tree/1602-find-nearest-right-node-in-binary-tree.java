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
    public TreeNode findNearestRightNode(TreeNode root, TreeNode u) {
        
        Queue<TreeNode> queue = new LinkedList();
        if(root != null)
            queue.add(root);
        
        while(!queue.isEmpty()){
            
            int size = queue.size();
            int i= 0;
            
            while(i< size){
                
                TreeNode current = queue.poll();
                
                if(current == u){
                    
                    if(!queue.isEmpty() && i+1 < size){
                        return queue.poll();
                    }    
                    
                    return null;
                }
                else{
                    
                    if(current.left != null)
                        queue.add(current.left);
                    if(current.right != null)
                        queue.add(current.right);
                }
                
                i++;
            }
            
        }
        
        return null;
        
    }
}