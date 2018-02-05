/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.2.28
 * @decription:
 */
public class RebuildBinTree
    {
        public TreeNode reConstructBinaryTree(int[] pre, int[] in)
            {
                return recursive(pre, 0, pre.length - 1, in, 0, in.length - 1);
            }
        
        static TreeNode recursive(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd)
            {
                if (preStart > preEnd)
                {
                    return null;
                }
                int cur = pre[preStart];
                int find = inStart;
                for (; find <= inEnd; find++)
                {
                    if (cur == in[find])
                    {
                        break;
                    }
                }
                int leftCounts = find - inStart;
                TreeNode root = new TreeNode(cur);
                root.left = recursive(pre, preStart + 1, preStart + leftCounts, in, inStart, find - 1);
                root.right = recursive(pre, preStart + leftCounts + 1, preEnd, in, find + 1, inEnd);
                return root;
            }
    }

class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;
        
        public TreeNode(int val)
            {
                this.val = val;
            }
    }