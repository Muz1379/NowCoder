/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.2.28
 * @decription: 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */

public class MinNubmer
    {
        public int minNumberInRotateArray(int[] array)
            {
                if (array.length == 0)
                {
                    return 0;
                }
                return search(array, 0, array.length - 1);
            }
    
        public static int search(int[] array, int start, int end)
            {
                int mid = (start + end) / 2;
                if ((end - mid) == 1)
                {
                    return array[end] < array[mid] ? array[end] : array[mid];
                }
                if (array[start] >= array[mid])
                {
                    return search(array, start, mid);
                }
                else
                {
                    return search(array, mid, end);
                }
            }
    }
