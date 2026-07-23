class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution {

    Node insert(Node root, int key) {

        if (root == null)
            return new Node(key);

        if (search(root, key))
            return root;

        Node cur = root;

        while (true) {

            if (key > cur.data) {

                if (cur.right != null)
                    cur = cur.right;
                else {
                    cur.right = new Node(key);
                    break;
                }

            } else {

                if (cur.left != null)
                    cur = cur.left;
                else {
                    cur.left = new Node(key);
                    break;
                }
            }
        }

        return root;
    }

    boolean search(Node root, int key) {

        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (key < root.data)
            return search(root.left, key);

        return search(root.right, key);
    }
}