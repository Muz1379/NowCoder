import java.util.Scanner;

/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.2.20
 * @decription:
 */
public class TopScore
    {
        static int stuCount;
        static int optCount;
        static int[] scores;
        static int[] out;
        static int point = 0;
        
        public static void main(String[] args)
            {
                int A = 0;
                int B = 0;
                char opt;
                Scanner sc = new Scanner(System.in);
                System.out.println("输入学生数量：");
                stuCount = sc.nextInt();
                System.out.println("输入操作数：");
                optCount = sc.nextInt();
                scores = new int[stuCount];
                out = new int[stuCount];
                for (int i = 0; i < stuCount; i++)
                {
                    scores[i] = sc.nextInt();
                }
                for (int i = 0; i < optCount; i++)
                {
                    opt = sc.next().toCharArray()[0];
                    A = sc.nextInt();
                    B = sc.nextInt();
                    switch (opt)
                    {
                        case 'U':
                            TopScore.update(A, B);
                            break;
                        case 'Q':
                            TopScore.query(A, B);
                            break;
                    }
                }
                sc.close();
                for (int i = 0; i < point; i++)
                {
                    System.out.println(out[i]);
                }
            }
        
        static void update(int stu, int score)
            {
                scores[stu - 1] = score;
                System.out.println("更新成功");
            }
        
        static void query(int stuA, int stuB)
            {
                out[point] = scores[stuA - 1] >= scores[stuB - 1] ? scores[stuA - 1] : scores[stuB - 1];
                point++;
                System.out.println("查询成功");
            }
    }
