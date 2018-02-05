import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.2.27
 * @decription:
 */
public class ReversalListTest
    {
        
        @Test
        public void test_PrintListFromTailToHead()
            {
                ReversalList reversalList = new ReversalList();
                ListNode lNode = null;
                ArrayList<Integer> arrayList = reversalList.printListFromTailToHead(lNode);
                System.out.println(arrayList);
            }
    }