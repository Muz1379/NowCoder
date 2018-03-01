/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.3.1
 * @decription: 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class FibonacciB
    {
        public int JumpFloorII(int target)
            {
                if (target == 1 || target == 0)
                {
                    return target;
                }
                int result = 2;
                for (int i = 2; i < target; i++)
                {
                    result *= 2;
                }
                return result;
            }
    }
