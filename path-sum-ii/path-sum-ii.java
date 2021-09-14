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
    public List<List<Integer>> returnList = new ArrayList();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<Integer>subList = new ArrayList();
        if(root != null) 
            dfs(root,0,targetSum,subList); 
        return returnList;
    }
     public void dfs(TreeNode root, int sum, int targetSum, List<Integer>subList){
        
        int currentSum = sum + root.val;
        subList.add(root.val);
         
        if(root.left ==  null && root.right == null && targetSum == currentSum )
        returnList.add(new ArrayList<>(subList));
            
        if(root.left != null)
            dfs(root.left,currentSum,targetSum,subList);
        if(root.right != null)
            dfs(root.right,currentSum,targetSum,subList);
        subList.remove(subList.size()-1);
         
    }
}