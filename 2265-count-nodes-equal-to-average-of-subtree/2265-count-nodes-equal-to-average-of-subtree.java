class Solution {

    int ans = 0;

    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return ans;
    }

    // returns {sum, count}
    private int[] dfs(TreeNode root) {

        if (root == null) {
            return new int[]{0, 0};
        }

        // Left subtree
        int[] left = dfs(root.left);

        // Right subtree
        int[] right = dfs(root.right);

        // Current subtree sum
        int sum = left[0] + right[0] + root.val;

        // Current subtree node count
        int count = left[1] + right[1] + 1;

        // Integer division
        int average = sum / count;

        if (root.val == average) {
            ans++;
        }

        return new int[]{sum, count};
    }
}