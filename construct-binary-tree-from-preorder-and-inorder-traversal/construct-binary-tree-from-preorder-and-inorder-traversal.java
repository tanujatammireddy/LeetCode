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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        
        if(preorder.length == 0 || inorder.length == 0) return null;
        
        int root_val = preorder[0];
        TreeNode root = new TreeNode (root_val);
        
        if(preorder.length == 1)  return root;
        
        int root_index = -1 ;
        
        for(int i=0; i< inorder.length ;i++){
            if(inorder[i] == root_val){
                root_index = i;
                break;
            }
        }
        
        int left_tree_length  = root_index;
        int right_tree_length = inorder.length - root_index-1;
        
        
        if(left_tree_length > 0){
            int[] left_inorder = subArray(inorder,0,left_tree_length-1 );
            int[] left_preorder = subArray(preorder,1,left_tree_length );
            root.left = buildTree( left_preorder,left_inorder);
        }
            
        if(right_tree_length > 0){
            
            int[] right_inorder = subArray(inorder,left_tree_length+1 , inorder.length-1);
            int[] right_preorder = subArray(preorder,left_tree_length+1, preorder.length-1);
            
            root.right = buildTree(right_preorder,right_inorder);
        }
        
        return root;
    }
    
   
    
    public int[] subArray(int[] array,int start,int end){
        
        int len = end-start+1;
        int[] subArray = new int[len];
        int j=0;
        for(int i= start;i<= end;i++,j++){
            subArray[j] = array[i];
        }
        return subArray;
    }
}