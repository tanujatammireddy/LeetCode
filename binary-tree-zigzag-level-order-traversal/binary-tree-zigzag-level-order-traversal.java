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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> returnList = new ArrayList();
        returnList = bfs(root);
        int i= 1;
        while(i< returnList.size()){
                List<Integer> list = returnList.get(i);
                Collections.reverse(list);
                i = i+2;
        }
        return returnList;
    }
    public List<List<Integer>> bfs(TreeNode root){
        List<List<Integer>> subList = new ArrayList();
        if(root != null){
            
            Queue<Pair<TreeNode,Integer>> queue = new LinkedList();
            queue.add(new Pair<>(root,0));
            
            while(!queue.isEmpty()){
                
                Pair p = queue.poll();
                TreeNode currentNode = (TreeNode)p.getKey();
                int currentLevel = (Integer)p.getValue();
                
                if(subList.isEmpty() ||currentLevel >= subList.size()){
                    List<Integer> list = new ArrayList();
                    subList.add(list);
                } 
                subList.get(currentLevel).add(currentNode.val);
                        
                if(currentNode.left != null)
                    queue.add(new Pair(currentNode.left,currentLevel+1));
                if(currentNode.right != null)
                    queue.add(new Pair(currentNode.right,currentLevel+1));
                    
            }
        }
        return subList;
    }
}