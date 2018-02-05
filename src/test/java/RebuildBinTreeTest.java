import org.junit.jupiter.api.Test;

/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.2.28
 * @decription:
 */
public class RebuildBinTreeTest
    {
        
        @Test
        public void test_ReConstructBinaryTree()
            {
                RebuildBinTree rebuild = new RebuildBinTree();
                
                int[] pre = {1, 2, 3, 4, 5, 6, 7};
                int[] in = {3, 2, 4, 1, 6, 5, 7};
                TreeNode tree;
                tree = rebuild.reConstructBinaryTree(pre, in);
                System.out.println(tree);
            }
    }