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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> returnList = new ArrayList();
        if(root != null)
        postOrder(root,returnList);
        return returnList;
    }
    public void postOrder(TreeNode root, List<Integer>returnList){
       if(root.left != null){
            postOrder(root.left,returnList);
        }
        if(root.right !=null){
            postOrder(root.right,returnList);
        }
         returnList.add(root.val);
    }
}