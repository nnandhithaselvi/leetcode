class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkBalance(root) != -1;
    }
    
    private int checkBalance(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        int leftHeight = checkBalance(node.left);
        if (leftHeight == -1) {
            return -1; // left subtree is not balanced
        }
        
        int rightHeight = checkBalance(node.right);
        if (rightHeight == -1) {
            return -1; // right subtree is not balanced
        }
        
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1; // current node is not balanced
        }
        
        return Math.max(leftHeight, rightHeight) + 1; // return height of current node
    }
}
