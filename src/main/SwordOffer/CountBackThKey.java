/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.3.2
 * @decription: 输入一个链表，输出该链表中倒数第k个结点。
 */
public class CountBackThKey
    {
        public ListNode FindKthToTail(ListNode head, int k)
            {
                if (k <= 0)
                {
                    return null;
                }
                ListNode pre = head;
                ListNode pointer = null;
                
                while (pre != null)
                {
                    if (k <= 0)
                    {
                        pointer = pointer.next;
                    }
                    k--;
                    if (k == 0)
                    {
                        pointer = head;
                    }
                    pre = pre.next;
                }
                return pointer;
            }
    }

class ListNode
    {
        int val;
        ListNode next = null;
        
        ListNode(int val)
            {
                this.val = val;
            }
    }
