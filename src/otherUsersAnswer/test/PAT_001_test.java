import java.util.Random;

/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.2.4
 * @decription:
 */
public class PAT_001_test
    {
        public static void main(String[] args)
            {
                int a;
                int b;
                double douB;
                Random rand = new Random();
                System.out.println("初始\t\t0.1*a");
                for (int i = 0; i < 10; i++)
                {
                    a = rand.nextInt(5000);
                    b = (int) (a * 0.1);
                    douB = a * 0.1;
                    System.out.println(a + "\t\t" + b + "\t\t" + douB);
                }
                
            }
    }
