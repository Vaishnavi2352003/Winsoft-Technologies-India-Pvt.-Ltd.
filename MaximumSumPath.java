/*Q2:Find maximum sum path involving elements of given arrays
        Given two sorted arrays of integers, find a maximum sum path involving elements of both arrays whose sum is maximum.
        We can start from either array, but we can switch between arrays only through its common elements.

        For example,

        Input: X = { 3, 6, 7, 8, 10, 12, 15, 18, 100 }
        Y = { 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50 }
        The maximum sum path is: 1 —> 2 —> 3 —> 6 —> 7 —> 9 —> 10 —> 12 —> 15 —> 16 —> 18 —> 100
        The maximum sum is 199*/


import java.util.Arrays;
public class MaximumSumPath
{
    public static int maxSumPath(int[] arr1, int[] arr2)
    {
        int sum1 = 0, sum2 = 0, result = 0;
        int i = 0, j = 0;
        int n = arr1.length, m = arr2.length;
        while (i < n && j < m)
        {
            if (arr1[i] < arr2[j])
                sum1 += arr1[i++];
            else if (arr1[i] > arr2[j])
                sum2 += arr2[j++];
            else {
                result += Math.max(sum1, sum2);
                sum1 = 0;
                sum2 = 0;
                while (i < n && j < m && arr1[i] == arr2[j])
                {
                    result += arr1[i];
                    i++;
                    j++;
                }
            }
        }

        while (i < n)
            sum1 += arr1[i++];

        while (j < m)
            sum2 += arr2[j++];

        result += Math.max(sum1, sum2);

        return result;
    }

    public static void main(String[] args)
    {
        int[] arr1 = { 2, 3, 7, 10, 12 };
        int[] arr2 = { 1, 5, 7, 8 };
        System.out.println("Maximum sum path: " + maxSumPath(arr1, arr2));
    }
}
