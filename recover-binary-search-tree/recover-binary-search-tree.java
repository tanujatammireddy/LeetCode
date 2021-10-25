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
    public void recoverTree(TreeNode root) {
    
        List<Integer> list = new ArrayList();
        TreeNode current = root;
        inorder_traversal(current,list);
        //System.out.println(""+list);
        
        int p=-1,q=-1;
        
        for(int i= 0;i< list.size()-1; i++){
            if(list.get(i) > list.get(i+1) ){
                q = i+1; 
                if(p == -1)
                    p= i;
        }
        }
        //System.out.println("p:"+p+" q:"+q);
        swap(root,list.get(p),list.get(q));
    }
    public void swap(TreeNode current,int p, int q){
        if(current == null) return;
        swap(current.left,p,q);
        if(current.val == p)
            current.val = q;
        else if(current.val == q)
            current.val = p;
        swap(current.right,p,q);
    }
    public void inorder_traversal(TreeNode current,List<Integer> list){
        if(current == null) return;
        inorder_traversal(current.left,list);
        list.add(current.val);
        inorder_traversal(current.right,list);
    }
    
}