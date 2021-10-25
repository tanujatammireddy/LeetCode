/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        int p_val = p.val;
        int q_val = q.val;
        
        TreeNode  node = root;
        while(node != null){
            
            int value = node.val;
            System.out.println(""+value);
            
            if(value < p_val && value < q_val)
                node = node.right;
            else if(value > p_val && value > q_val)
                node = node.left;
            else
                return node;
            
        }
        return null;
    }
}