import junit.framework.*;
import org.junit.Test;
import org.junit.Assert;

public class BinarySearchTreeTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}
    
    /**
     * null
     */
    @Test
    public void testNullTree() {
        TreeNode tree = null;
		assertEquals(null, BinarySearchTree.search(tree, 42));
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
    @Test
    public void testFound6() {
        TreeNode tree = 
            new TreeNode(8, 
                new TreeNode(3, 
                    new TreeNode(1, null, null), 
                    new TreeNode(6, 
                        new TreeNode(4, null, null),
                        new TreeNode(7, null, null)
                    )
                ), 
                new TreeNode(10, 
                    null, 
                    new TreeNode(14, 
                        new TreeNode(13, null, null), 
                        null
                    )
                )
            );

        TreeNode search = BinarySearchTree.search(tree, 6);
		assertEquals(6, search.getValue());
    }

    @Test
    public void testFound13() {
        TreeNode tree = 
            new TreeNode(8, 
                new TreeNode(3, 
                    new TreeNode(1, null, null), 
                    new TreeNode(6, 
                        new TreeNode(4, null, null),
                        new TreeNode(7, null, null)
                    )
                ), 
                new TreeNode(10, 
                    null, 
                    new TreeNode(14, 
                        new TreeNode(13, null, null), 
                        null
                    )
                )
            );

        TreeNode search = BinarySearchTree.search(tree, 13);
		assertEquals(13, search.getValue());
    }

    @Test
    public void testFound12() {
        TreeNode tree = 
            new TreeNode(8, 
                new TreeNode(3, 
                    new TreeNode(1, null, null), 
                    new TreeNode(6, 
                        new TreeNode(4, null, null),
                        new TreeNode(7, null, null)
                    )
                ), 
                new TreeNode(10, 
                    null, 
                    new TreeNode(14, 
                        new TreeNode(13, null, null), 
                        null
                    )
                )
            );

		assertEquals(null, BinarySearchTree.search(tree, 12));
    }
}
