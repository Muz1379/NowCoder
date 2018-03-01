/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.3.1
 * @decription:
 */
public class Fibonacci
    {
        public int Fibonacci(int n)
            {
                if (n < 3)
                {
                    return 1;
                }
                else
                {
                    return Fibonacci(n - 1) + Fibonacci(n - 2);
                }
            }
    }
