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
        
        List<List<Integer>> returnList = new ArrayList();
        
        while(root != null){
            
             List<Integer> list = new ArrayList();
             boolean isLeaf = leaves(root,list);
             
             returnList.add(list);    
             //System.out.println(list);
            
            if(isLeaf == true){
                list.add(root.val);
                break;
            }
                
        }
       // traversal(root);
       
        return returnList;
        
    }
    
    public void traversal(TreeNode root){
       
        System.out.println(root.val);
        if(root.left != null)
            traversal(root.left);
        if(root.right != null)
            traversal(root.right);
    }
    public boolean leaves(TreeNode root,List<Integer> list ){
        
        if(root.left == null && root.right == null)
            return true;
        
        if(root.left != null){
            if(leaves(root.left,list)){
                list.add(root.left.val);
                root.left = null;
            }
        }
        
        if(root.right != null){
            if(leaves(root.right,list)){
                list.add(root.right.val);
                root.right = null;
            }
        }
        
        return false;
    }
}