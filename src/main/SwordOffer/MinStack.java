import java.util.Stack;

/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.3.6
 * @decription: 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
public class MinStack
    {
        Stack<Integer> stackA = new Stack<Integer>();
        Stack<Integer> stackB = new Stack<Integer>();
        boolean flag = false;
        
        public void push(int node)
            {
                if (flag)
                {
                    if (node < stackB.peek())
                    {
                        stackB.push(node);
                    }
                    stackA.push(node);
                }
                else
                {
                    stackB.push(node);
                    stackA.push(node);
                    flag = true;
                }
                
            }
        
        public void pop()
            {
                int num = stackA.pop();
                int num2 = stackB.pop();
                if (num != num2)
                {
                    stackB.push(num2);
                }
            }
        
        public int top()
            {
                return stackA.peek();
            }
        
        public int min()
            {
                return stackB.peek();
            }
    }
