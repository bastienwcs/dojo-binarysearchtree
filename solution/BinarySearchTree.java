class BinarySearchTree {

    static TreeNode search(TreeNode node, int n) {
        if (node == null || node.getValue() == n ) {
            return node;        
        }
        if (node.getValue() > n) {
            return search(node.getLeft(), n);        
        }
        return search(node.getRight(), n);    
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
