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
    StringBuilder start;
    StringBuilder destination;
    public String getDirections(TreeNode root, int startValue, int destValue) {
        
        start = new StringBuilder();
        destination = new StringBuilder();
        path(root,startValue,start);
        path(root,destValue,destination);
        start.reverse();
        destination.reverse();
        
        int i=0,j= 0;
        while(i< start.length() && j< destination.length() && start.charAt(i) == destination.charAt(j)){
            i++;
            j++;
        }
        
        StringBuilder sb = new StringBuilder();
		while(i< start.length()){
			sb.append("U");
			i++;
		}
		sb.append(destination.substring(j));
		return sb.toString();
        
    }
    
    public boolean path(TreeNode root, int node,StringBuilder sb){
        
        
        if(root == null)
            return false;
        if(root.val == node)
            return true;
        
        else{
            
            boolean left = path(root.left,node,sb);
            if(left)
                sb.append('L');
            boolean right =path(root.right,node,sb);
            if(right)
                sb.append('R');
            
            return left || right;
        }
    }
}