/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.3.1
 * @decription: 输入一个整数，输出该数二进制表示中1的个数。 其中负数用补码表示。
 */
public class OneInBinary
    {
        public int NumberOf1(int n)
            {
                int res = 0;
                char[] resChars = Integer.toBinaryString(n).toCharArray();
                for (char resChar : resChars)
                {
                    if (resChar == '1')
                    {
                        res++;
                    }
                }
                return res;
            }
    }
