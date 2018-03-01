import java.math.BigDecimal;

/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.3.1
 * @decription: 给定一个double类型的浮点数base和int类型的整数exponent。 求base的exponent次方
 */
public class PowerOfDouble
    {
        public double Power(double base, int exponent)
            {
                if (exponent == 0)
                {
                    return 1;
                }
                
                BigDecimal baseA = new BigDecimal(base);
                BigDecimal baseB = new BigDecimal(base);
                if (exponent > 0)
                {
                    while (exponent-- > 1)
                    {
                        baseA = baseA.multiply(baseB);
                    }
                }
                else
                {
                    while (exponent++ <= 0)
                    {
                        baseA = baseA.divide(baseB);
                    }
                }
                return baseA.doubleValue();
            }
    }
