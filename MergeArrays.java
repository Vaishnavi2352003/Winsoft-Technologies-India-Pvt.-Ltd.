/*Q1: Merge two arrays by satisfying given constraints
        Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells,
        merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.

        For example,

        Input: X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 }
        Y[] = { 1, 8, 9, 10, 15 } The vacant cells in X[] is represented by 0
        Output: X[] = { 1, 2, 3, 5, 6, 8, 9, 10, 15 }*/


import java.util.Arrays;
public class MergeArrays
{
    public static void main(String[] args)
    {
        int[] X = {0, 2, 0, 5, 0, 2, 8, 0, 1};
        int[] Y = {2, 8, 11, 10, 15};
        mergeArrays(X, Y);
        System.out.println("Merged array: " + Arrays.toString(X));
    }
    public static void mergeArrays(int[] X, int[] Y)
    {
        int m = X.length;
        int n = Y.length;
        int i = n - 1;
        int j = 0;
        int k = m - 1;
        while (i >= 0 && j < n)
        {
            if (X[i] > Y[j])
            {
                X[k--] = X[i--];
            }
            else
            {
                X[k--] = Y[j++];
            }
        }
        while (j < n)
        {
            X[k--] = Y[j++];
        }
    }
}
