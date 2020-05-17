// QUICK SORT ALGORITHM

import java.util.Arrays;
import java.util.Scanner;

public class QuickSortAlgorithm
{
    static int Partition(int[] Arr, int start, int end)
    {
        int pivot = Arr[end];       // Choosing the end element as the pivot.
        int partitionIndex = start;         // Setting the partition index as 'start' initially.

        for(int i = start; i < end; i++)
        {
            if(Arr[i] <= pivot)
            {
                int temp = Arr[i];                  // Swapping the current element with the element at the
                Arr[i] = Arr[partitionIndex];       // partition index, if the element is lesser than the pivot.
                Arr[partitionIndex] = temp;

                partitionIndex++;
            }
        }

        int temp = Arr[partitionIndex];         // Swapping the pivot with the element at the partition index.
        Arr[partitionIndex] = Arr[end];
        Arr[end] = temp;

        return partitionIndex;
    }

    static void QuickSort(int[] Arr, int start, int end)
    {
        if(start < end)
        {
            int partitionIndex = Partition(Arr, start, end);
            QuickSort(Arr, start, (partitionIndex - 1));
            QuickSort(Arr, (partitionIndex + 1), end);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("QUICK SORT ALGORITHM\n");

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

        QuickSort(Arr, 0, (n - 1));
        System.out.println("The sorted array: " + Arrays.toString(Arr));
    }
}