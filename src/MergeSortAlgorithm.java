// MERGE SORT ALGORITHM

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortAlgorithm
{
    static void Merge(int[] L, int[] R, int[] Arr)
    {
        int nL = L.length;
        int nR = R.length;

        int i = 0, j = 0, k = 0;

        while((i < nL) && (j < nR))
        {
            if(L[i] <= R[j])
            {
                Arr[k] = L[i];
                i++;
            }
            else
            {
                Arr[k] = R[j];
                j++;
            }

            k++;
        }
        while(i < nL)
        {
            Arr[k] = L[i];
            i++;
            k++;
        }
        while(j < nR)
        {
            Arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void MergeSort(int[] Arr)
    {
        int n = Arr.length;

        if(n < 2)
            return;

        int mid = n/2;

        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for(int i = 0; i < mid; i++)
        {
            left[i] = Arr[i];
        }

        for(int i = mid; i < n; i++)
        {
            right[i - mid] = Arr[i];
        }

        MergeSort(left);
        MergeSort(right);
        Merge(left, right, Arr);
    }

    public static void main(String[] args)
    {
        System.out.println("MERGE SORT ALGORITHM\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements do you wanna insert? ");
        int n = sc.nextInt();

        int[] Arr = new int[n];

        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++)
        {
            Arr[i] = sc.nextInt();
        }

        System.out.println("The entered array: " + Arrays.toString(Arr));

        MergeSort(Arr);
        System.out.println("The sorted array: " + Arrays.toString(Arr));
    }
}