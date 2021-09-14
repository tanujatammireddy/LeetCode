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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> returnList = new ArrayList();
        if(root!=null)
        inOrderTraversal(root,returnList);
        return returnList;
    }
    public void inOrderTraversal(TreeNode root,List<Integer> returnList){
        
        if(root.left != null)
        inOrderTraversal(root.left,returnList);
        returnList.add(root.val);
        if(root.right != null)
        inOrderTraversal(root.right,returnList);
    }
}