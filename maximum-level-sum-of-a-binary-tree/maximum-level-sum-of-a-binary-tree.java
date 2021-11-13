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
    public int maxLevelSum(TreeNode root) {
        
        
        Queue<Pair<TreeNode,Integer>> queue = new LinkedList();
        queue.add(new Pair(root,0));
        int maxSum = 0;
        List<Integer> level_sum = new ArrayList();
        
        while(!queue.isEmpty()){
            
            Pair p = queue.poll();
            TreeNode current = (TreeNode) p.getKey();
            int level = (Integer) p.getValue();
            
            //System.out.println(level);
            
            if(level_sum.isEmpty() || level == level_sum.size() )
                level_sum.add(current.val);
            else 
            {
                int sum = level_sum.get(level) + current.val ;
                level_sum.set(level, sum);
            }
            
            if(current.left != null)
                 queue.add(new Pair(current.left,level+1));
            
            if(current.right != null)
                 queue.add(new Pair(current.right,level+1));
        
        }
        
        int maxLevelSum = Integer.MIN_VALUE;
        int maxLevel = -1;
        //System.out.print(level_sum);
        for(int i=0 ;i< level_sum.size() ;i++){
            
            if(level_sum.get(i) >maxLevelSum){
                
                maxLevelSum = level_sum.get(i);
                maxLevel = i+1;
            }
               
        }
        
        return maxLevel;
    }
}