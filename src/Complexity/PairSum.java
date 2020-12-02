package Complexity;

import java.util.Arrays;

public class PairSum {
    /**
     * General O(n2) approach
     */
    public static void main(String[] args) {
        int c[] = {1, 3, 6, 2, 5, 4, 3, 2, 4};
        Arrays.sort(c);
        System.out.println(getPairSumToX(c, 7));
    }

    public static int getPairSumToX(int a[], int x) {
        int start = 0;
        int end = a.length - 1;
        int pairCount = 0;
        while (start < end) {
            if (a[start] + a[end] > x) {
                end--;
            } else if (a[start] + a[end] < x) {
                start++;
            } else {
                if (a[start] == a[end]) {
                    int tmp = end - start + 1;
                    pairCount = pairCount + (tmp * (tmp - 1) / 2);
                    for (int i = 0; i < pairCount; i++)
                        System.out.println("(" + a[start] + "," + a[end] + ")");

                    return pairCount;
                }
                //Count no of x
                int startIndex = start + 1;
                int endIndex = end - 1;

                while (startIndex <= endIndex && a[start] == a[startIndex]) {
                    startIndex++;
                }

                while (endIndex >= startIndex && a[end] == a[endIndex]) {
                    endIndex--;
                }

                pairCount += (startIndex - start) * (-endIndex + end);
                for (int i = 0; i < pairCount; i++) {
                    System.out.println("(" + a[start] + "," + a[end] + ")");
                }
                start = startIndex;
                end = endIndex;
            }
        }
        return pairCount;
    }
}
