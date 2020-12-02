package CodeChef;

import java.util.Scanner;

public class Gasoline {
    public static void main(String[] args) {
//        int case1[] = {2, 0, 0, 3, 7};
//        int case2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
//        int case3[] = {5,4,3,2,1};
//
//        System.out.println("Case 1: " + getMaxDistance(case1));
//        System.out.println("Case 2: " + getMaxDistance(case2));
//        System.out.println("Case 3: " + getMaxDistance(case3));

        Scanner scanner=new Scanner(System.in);
        int testcases=scanner.nextInt();
        for(int i=0;i<testcases;i++){
            int count=scanner.nextInt();
            int fuels[]=new int[count];
            for(int k=0;k<count;k++){
                fuels[k]=scanner.nextInt();
            }
            System.out.println(getMaxDistance(fuels));
        }
    }

    static public int getMaxDistance(int gasoline[]) {
        int maxDistanceSoFar = 0;
        int gasolineLeft = gasoline[0];
        for (int i = 1; i < gasoline.length; i++) {
            ++maxDistanceSoFar;
            gasolineLeft = gasolineLeft -1+ gasoline[i];
            if (gasolineLeft == 0) {
                return maxDistanceSoFar;
            }
        }
        return (maxDistanceSoFar + gasolineLeft);
    }
}
