import java.util.Scanner;

/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.2.4
 * @decription: 题目链接：https://www.nowcoder.net/pat/6/problem/4077
 */
public class BLevel_1001
    {
        public static void main(String[] args)
            {
                byte testCaseNum; //此题有内存限制，测试用例个数 <=10，因此使用byte足够
                long[] input = new long[3];
                Scanner in = new Scanner(System.in);
                
                testCaseNum = in.nextByte();
                boolean[] result = new boolean[testCaseNum];
                for (byte j = 0; j < testCaseNum; j++)
                {
                    for (int i = 0; i < 3; i++)
                    {
                        input[i] = in.nextLong();
                    }
                    result[j] = input[0] + input[1] > input[2];
                }
                testCaseNum = 1;
                for (boolean b : result)
                {
                    System.out.printf("Case #%d: %b\n", testCaseNum, b);
                    testCaseNum++;
                }
            }
    }
