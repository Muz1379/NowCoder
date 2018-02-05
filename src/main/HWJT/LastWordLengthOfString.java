import java.util.Scanner;

/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.2.20
 * @decription:
 */
public class LastWordLengthOfString
    {
        public static void main(String[] args)
            {
                System.out.println("字符串最后一个单词的长度");
                int length = 0;
                String in;
                Scanner sc = new Scanner(System.in);
                in = sc.nextLine();
                length = in.split("\\s")[in.split("\\s").length - 1].length();
                System.out.println(length);
                
            }
    }
