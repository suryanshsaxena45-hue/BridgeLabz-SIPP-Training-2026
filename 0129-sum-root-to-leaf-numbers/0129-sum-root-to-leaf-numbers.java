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
    int sum=0;
    public int sumNumbers(TreeNode root) {
        getleafSum(root,0);
        return sum;
    }
    public void getleafSum(TreeNode root,int curtNum){
        if(root==null){
            return;
        }
        curtNum = curtNum*10+root.val;
        if(root.left == null && root.right == null){
            sum+=curtNum;
            return;
        }
        getleafSum(root.left,curtNum);
        getleafSum(root.right,curtNum);
    }
}