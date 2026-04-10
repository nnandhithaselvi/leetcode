class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return build(1, n);
    }

    public List<TreeNode> build(int start, int end) {
        List<TreeNode> list = new ArrayList<>();

        // Base case
        if (start > end) {
            list.add(null);
            return list;
        }

        // Try each number as root
        for (int i = start; i <= end; i++) {

            // Left subtree
            List<TreeNode> leftTrees = build(start, i - 1);

            // Right subtree
            List<TreeNode> rightTrees = build(i + 1, end);

            // Combine left & right
            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    list.add(root);
                }
            }
        }
        return list;
    }
}