/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.3.1
 * @decription: 一只青蛙一次可以跳上1级台阶，也可以跳上2级。 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JumpFloor
    {
        public int jumpFloor(int target)
            {
                if (target == 1)
                {
                    return 1;
                }
                else if (target == 2)
                {
                    return 2;
                }
                int res = 0;
                int preA = 1;
                int preB = 2;
                
                for (int i = 2; i < target; i++)
                {
                    res = preB + preA;
                    preA = preB;
                    preB = res;
                }
                return res;
            }
    }
