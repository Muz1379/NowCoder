import java.util.ArrayList;

/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.2.27
 * @decription:
 */
public class ReversalList
    {
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode)
            {
                ListNode result = reversal(listNode);
                ArrayList<Integer> alist = new ArrayList<Integer>();
                while (result != null)
                {
                    alist.add(result.val);
                    System.out.println(result.val);
                    result = result.next;
                }
                return alist;
            }
        
        private ListNode reversal(ListNode right)
            {
                
                ListNode left = null;
                ListNode temp;
                
                while (right != null)
                {
                    temp = right;
                    right = right.next;
                    temp.next = left;
                    left = temp;
                }
                return left;
            }
    }

/**
 * 链表节点
 */
class ListNode
    {
        int val;
        ListNode next = null;
        
        ListNode(int val)
            {
                this.val = val;
            }
    }