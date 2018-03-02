/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.3.2
 * @decription: 输入两个单调递增的链表，输出两个链表合成后的链表， 当然我们需要合成后的链表满足单调不减规则。
 */
public class MergeList
    {
        public ListNode Merge(ListNode list1, ListNode list2)
            {
                ListNode result = null;
                boolean flag = true;
                
                ListNode resultPointer = result;
                ListNode temp;
                
                while ((list1 != null) || (list2 != null))
                {
                    if (list1 != null && list2 != null)
                    {
                        
                        
                        if (list1.val <= list2.val)
                        {
                            temp = list1;
                            list1 = list1.next;
                        }
                        else
                        {
                            temp = list2;
                            list2 = list2.next;
                        }
                    }
                    else if (list1 == null && list2 != null)
                    {
                        temp = list2;
                        list2 = list2.next;
                    }
                    else
                    {
                        temp = list1;
                        list1 = list1.next;
                    }
                    if (flag)
                    {
                        result = temp;
                        resultPointer = result;
                        flag = false;
                    }
                    else
                    {
                        resultPointer.next = temp;
                        resultPointer = resultPointer.next;
                    }
                }
                return result;
            }
    }
