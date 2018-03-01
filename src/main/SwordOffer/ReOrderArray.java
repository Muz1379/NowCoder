/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.3.1
 * @decription: 输入一个整数数组，实现一个函数来调整该数组中数字的顺序， 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分， 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ReOrderArray
    {
        public void reOrderArray(int[] array)
            {
                boolean a, b;
                int oddProbe = 0;
                int evenProbe = array.length - 1;
                int oddPos = 0;
                int evenPos = array.length - 1;
                int[] arrayCopy = array.clone();
                for (; oddProbe < array.length; oddProbe++, evenProbe--)
                {
                    a = array[oddProbe] % 2 == 0 ? true : false;
                    b = array[evenProbe] % 2 == 0 ? true : false;
                    if (!a)
                    {
                        arrayCopy[oddPos] = array[oddProbe];
                        oddPos++;
                    }
                    if (b)
                    {
                        arrayCopy[evenPos] = array[evenProbe];
                        evenPos--;
                    }
                }
                for (int i = 0; i < arrayCopy.length; i++)
                {
                    array[i] = arrayCopy[i];
                }
            }
    }
