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
public TreeNode buildTree(int[] inorder, int[] postorder) {


        int len = inorder.length  ;

        int rootVal = postorder[len-1];
        TreeNode  root = new TreeNode(rootVal);
        int left = 0;
        int right = 0;
        int left_subtree_inorder = -1;
        int right_subtree_inorder = -1;
        int left_subtree_postorder = -1;
        int right_subtree_postorder = -1;

        for(int i = 0; i< len ;i++){
            if(inorder[i] == rootVal){
                left_subtree_inorder = i-1;
                right_subtree_inorder = i+1;
                break;
            }     
        }
        left = left_subtree_inorder+1;
        right = len - left-1;

       if(left != 0)
           root.left = buildTree(Arrays.copyOfRange(inorder, 0, left), Arrays.copyOfRange(postorder, 0, left));

       if(right != 0)
           root.right = buildTree(Arrays.copyOfRange(inorder, left+1, len), Arrays.copyOfRange(postorder, left, len-1));

    return root;


}


}