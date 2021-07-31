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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> returnList = new ArrayList();
        if(root != null)
        preOrder(root,returnList);
        return returnList;
    }
    public void preOrder(TreeNode root, List<Integer>returnList){
        returnList.add(root.val);
        if(root.left != null){
            preOrder(root.left,returnList);
        }
        if(root.right !=null){
            preOrder(root.right,returnList);
        }
    }
}