import java.util.Scanner;

/**
 * @author: 李令新 stullx@qq.com
 * @date: 2018.2.5
 * @decription: https://www.nowcoder.net/pat/5/problem/4324
 */
public class ALevel_1001
    {
        public static void main(String[] args)
            {
                
                //站点最大容量
                int maxContainCapacityOfStation;
                //站点数量
                int totalNumberOfStations;
                //问题站点编号
                int problemStation;
                //道路数量
                int totalNumberOfRoads;
                //每个站点当前车数量
                int[] numberOfBikePerStation;
                //道路地图
                int[][][] maps;
                
                String[] input;
                
                Scanner in = new Scanner(System.in);
                input = in.next().split("\\s+");
                maxContainCapacityOfStation = Integer.parseInt(input[0]);
                totalNumberOfStations = Integer.parseInt(input[1]);
                problemStation = Integer.parseInt(input[2]);
                totalNumberOfRoads = Integer.parseInt(input[3]);
                
                input = in.next().split("\\s+");
                numberOfBikePerStation = from(input);
                maps = new int[totalNumberOfRoads][][];
                for (int i = 0; i < totalNumberOfRoads; i++)
                {
                    // maps[i]=from(in.next().split("\\s+"));
                    
                }
            }
        
        /**
         * @param src
         *         字符串数组
         *
         * @return 整型数组
         */
        private static int[] from(String[] src)
            {
                int[] des = new int[src.length];
                for (int i = 0; i < src.length; i++)
                {
                    des[i] = Integer.parseInt(src[i]);
                }
                return des;
            }
    }
