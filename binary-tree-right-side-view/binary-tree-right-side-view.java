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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> rightSideList = new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
        
        if(root != null){
            queue.add(root);
        }
        
        
        while(!queue.isEmpty()){
            
            int levelSize = queue.size();
            //System.out.println(levelSize);
            
            for(int i= 0; i< levelSize; i++){
                
                TreeNode current = queue.poll();
                //System.out.println("current"+current.val);
                
                if(i == levelSize-1)
                    rightSideList.add(current.val);
                
                if(current.left != null)
                    queue.add(current.left);
                
                if(current.right != null)
                    queue.add(current.right);
            }
            //System.out.println("**level end**");
        }
        
        return rightSideList;
    }
}