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
    public List<List<Integer>> levelOrder(TreeNode root) {
    
        
        List<List<Integer>> returnList = new ArrayList();
        if(root != null){
        Queue<Pair<TreeNode,Integer>> queue = new LinkedList();
        queue.add(new Pair(root,0));
        
        while(!queue.isEmpty()){
            
            Pair top = queue.poll();
            
            TreeNode parent  = (TreeNode)top.getKey();
            int currentLevel = (int)top.getValue()+1;
            TreeNode left  = parent.left;
            TreeNode right = parent.right;
            
            if(currentLevel > returnList.size() )
            {
             List<Integer> sublist = new ArrayList();
             sublist.add(parent.val);
             returnList.add(sublist);
            }
            else
                returnList.get(currentLevel-1).add(parent.val);
            
            if(left != null ){
                queue.add(new Pair(left,currentLevel));
                
            }
            if(right != null){
                queue.add(new Pair(right,currentLevel));
            }
        }
        }
        return returnList;
    }
}