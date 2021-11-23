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
        
        
        List<List<Integer>> levelOrderList = new ArrayList();
        Queue<Pair<TreeNode,Integer>> queue = new LinkedList();
        
        if(root != null)
            queue.add(new Pair(root,0));
        
        while(!queue.isEmpty()){
            
            
            Pair p = queue.poll();
            TreeNode current = (TreeNode) p.getKey();
            int currentLevel = (Integer) p.getValue();
            
            if(levelOrderList.size() == 0 || currentLevel == levelOrderList.size()  ){
            levelOrderList.add(new ArrayList());
            }
            levelOrderList.get(currentLevel).add(current.val);
            
            if(current.left != null)
                queue.add(new Pair(current.left,currentLevel+1));
                
            if(current.right != null)
                queue.add(new Pair(current.right,currentLevel+1));
        }
        
        
        
        
        
        return levelOrderList;
        
    }
}