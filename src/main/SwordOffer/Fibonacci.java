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
    
        public int Fibo(int n)
            {
                if (n == 0)
                {
                    return 0;
                }
                if (n < 3)
                {
                    return 1;
                }
                int preA = 1;
                int preB = 1;
                int res = 0;
                for (int i = 2; i < n; i++)
                {
                    res = preA + preB;
                    preA = preB;
                    preB = res;
                }
                return res;
            }
    }
