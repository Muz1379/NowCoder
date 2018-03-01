/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.3.1
 * @decription: 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class RectangleCover
    {
        public int RectCover(int target)
            {
                int ways = 0;
                if (target < 3)
                {
                    return target;
                }
                else
                {
                    return RectCover(target - 1) + RectCover(target - 2);
                }
        
            }
    
        /**
         * 迭代求矩形覆盖
         *
         * @param target
         *
         * @return
         */
        public int RectCoverIteration(int target)
            {
                if (target < 3)
                {
                    return target;
                }
                int A = 1;
                int B = 2;
                int result = 0;
                while (target-- > 2)
                {
                    result = A + B;
                    A = B;
                    B = result;
                }
                return result;
            }
    }
