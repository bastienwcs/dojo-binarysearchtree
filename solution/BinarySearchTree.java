class BinarySearchTree {

    static TreeNode search(TreeNode node, int value) {
        
        TreeNode result;
        if (node == null) {
            return null;
        }
        int key = node.getValue();
        if (key == value) {
            return node;
        } else if (key > value) {
            result = search(node.getLeft(), value);
        } else {
            result = search(node.getRight(), value);
        }

        return result;
    }

    /**
    *        8
    *      /   \
    *     3     10
    *    / \      \
    *   1   6      14
    *      / \    /
    *     4   7  13
    **/
}
