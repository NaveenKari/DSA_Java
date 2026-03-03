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
        List<List<Integer>> res = new ArrayList<>();
        levelOrderRec(res,0,root);
        return res;
    }

    private void levelOrderRec(List<List<Integer>> res, int level, TreeNode root){
        if(root == null) return;

        if(res.size() <= level){
            res.add(new ArrayList<Integer>());
        }

        res.get(level).add(root.val);

        levelOrderRec(res,level+1,root.left);
        levelOrderRec(res,level+1,root.right);
    }
}