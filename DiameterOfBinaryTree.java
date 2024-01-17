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
public class Solution {
    int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }
    
    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        max = Math.max(max, left + right);
        
        return Math.max(left, right) + 1;
    }
}



/************************************************************

 Following is the Binary Tree node structure:

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;

     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
 }

 ************************************************************/

import java.util.*;

public class Solution {
    
    public static boolean isLeaf(TreeNode root)
    {

        if(root.left==null && root.right==null)
            return true;

    }

    public static void addleafNode(TreeNode root,List<Integer> result)
    {
       if (isLeaf(root)) {
            res.add(root.data);
            return;
        }

        if(node.left!=null) 
        {
            addleafNode(node.left,result);
        }
        if(node.right!=null) 
        {
            addleafNode(node.right,result);
        }
    }

    public static void addLeftBoundary(TreeNode root,List<Integer> result)
    {
       Node cur=root.left;
       while(cur!=null)
       {
           if(isLeaf(cur)==false) 
           {
               result.add(cur.data);
           }
           if(cur.left!=null)
           {
               result.add(cur.left);
           }
           else
           {
               result.add(cur.right);
           }
       }
    }

     public static void addRightBoundary(TreeNode root,List<Integer> result)
    {

        Node cur=root.right;
        Stack<Integer> res=new Stack<Integer>();
       while(cur!=null)
       {
           if(isLeaf(cur)==false) 
           {
               result.add(cur.data);
           }
           if(cur.right!=null)
           {
               res.push(cur.right);
           }
           else
           {
               res.push(cur.left);
           }
       }

       while(!res.isEmpty())
       {
           result.add(res.pop());
       }
           

    }



    public static List<Integer> traverseBoundary(TreeNode root){
     List<Integer> result=new ArrayList<Integer>();
     if(isLeaf(root)) result.add(node.data);
     addLeftBoundary(root,result);
     addleafNode(root,result);
     addRightBoundary(root,result);

     return result;
    }
}