/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.3.3
 * @decription: 操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class MirrorBinTree
    {
        public void Mirror(TreeNode root)
            {
                if (root == null)
                {
                    return;
                }
                if (root.left == root.right)
                {
                    return;
                }
                else
                {
                    TreeNode temp = root.left;
                    root.left = root.right;
                    root.right = temp;
                    Mirror(root.right);
                    Mirror(root.left);
                }
            }
    }
