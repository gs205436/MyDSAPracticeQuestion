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
    public int maxDepth(TreeNode root) {
        
        if(root==null)
        {
            return 0;
        }
        int lh=maxDepth(root.left);
        System.out.println("lh"+lh);
        int rh=maxDepth(root.right);
         System.out.println("rh"+rh);
        
        return 1+Math.max(lh,rh);
    }
}