import java.util.ArrayList;

/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.3.7
 * @decription: 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class PrintBinTree
    {
        public ArrayList<Integer> PrintFromTopToBottom(TreeNode root)
            {
                ArrayList<Integer> list = new ArrayList<Integer>();
                ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
                if (root == null)
                {
                    return list;
                }
                queue.add(root);
                while (!queue.isEmpty())
                {
                    TreeNode temp = queue.remove(0);
                    if (temp.left != null)
                    {
                        queue.add(temp.left);
                    }
                    if (temp.right != null)
                    {
                        queue.add(temp.right);
                    }
                    list.add(temp.val);
                }
                return list;
            }
    }
