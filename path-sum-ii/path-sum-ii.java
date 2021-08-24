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
    List<List<Integer>> returnList = new ArrayList();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<Integer> list = new ArrayList();
        if(root!= null)  dfs(root,0,targetSum,list);
        return returnList;
    }
    
    public void dfs(TreeNode root, int sum, int targetSum, List<Integer> list){
        
        int current = root.val;
        current += sum;
        list.add(root.val);
        if(current == targetSum && root.left == null && root.right == null) {
            returnList.add(new ArrayList<>(list));
        }
        else{
          if(root.left != null)
            dfs(root.left,current,targetSum,list);
          if(root.right != null)
            dfs(root.right,current,targetSum,list);
        }
        list.remove(list.size()-1);  
        
    }
}