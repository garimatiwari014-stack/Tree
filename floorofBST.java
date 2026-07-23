class Tree {
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
    // Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) {
        if (root == null)
            return -1;
        // Code here

        int floor = -1;

        while (root != null) {

            if (root.data == key) {

                floor = root.data;
                return floor;
            }

            if (key > root.data) {
                floor = root.data;
                root = root.right;

            }

            else {

                root = root.left;

            }
        }

        return floor;
    }
}