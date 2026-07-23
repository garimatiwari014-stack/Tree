class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {

    public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null)
            return null;

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }
        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }
        else {

            // No child
            if (root.left == null && root.right == null)
                return null;

            // Only right child
            if (root.left == null)
                return root.right;

            // Only left child
            if (root.right == null)
                return root.left;

            // Two children
            int lmax = max(root.left);
            root.val = lmax;
            root.left = deleteNode(root.left, lmax);
        }

        return root;
    }

    private int max(TreeNode node) {

        while (node.right != null) {
            node = node.right;
        }

        return node.val;
    }
}