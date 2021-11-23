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
    public boolean isCompleteTree(TreeNode root) {
        
        
        Queue<TreeNode> queue = new LinkedList();
        
        if(root != null)
            queue.add(root);
        
        int maxSize = 1;
        
        while(!queue.isEmpty()){
            
            int size = queue.size();
            int count = 0;
            boolean nullFound = false;
            
            for(int i=0 ;i< size ;i++){
                
                boolean hasChild = false;
                TreeNode current = queue.poll();
                count++;
                
                if(current.left != null || current.right != null)
                    hasChild = true;
                
                if(nullFound && hasChild)
                    return false;
                
                if(current.left != null)
                    queue.add(current.left);
                else
                    nullFound = true;
                
                if(nullFound && hasChild)
                    return false;
                
                if(current.right != null)
                    queue.add(current.right);
                else
                    nullFound = true;
            }
            if(!queue.isEmpty() && count != maxSize){
                return false;
            }
            maxSize = 2*maxSize;
            //level++;
        }
        
        return true;
        
    }
}