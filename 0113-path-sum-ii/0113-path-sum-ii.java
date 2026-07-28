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
 */class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        dfs(root, targetSum, new ArrayList<>());

        return ans;
    }

    private void dfs(TreeNode root, int targetSum, List<Integer> path) {

        if (root == null)
            return;

        // Add current node
        path.add(root.val);

        // Check if it is a valid leaf
        if (root.left == null &&
            root.right == null &&
            targetSum == root.val) {

            ans.add(new ArrayList<>(path));
        }

        // Visit children
        dfs(root.left, targetSum - root.val, path);
        dfs(root.right, targetSum - root.val, path);

        // Backtracking
        path.remove(path.size() - 1);
    }
}