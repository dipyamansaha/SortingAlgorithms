// SELECTION SORT ALGORITHM

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortAlgorithm
{
    static void SelectionSort(int[] Arr)
    {
        int n = Arr.length;

        for(int i = 0; i < (n - 1); i++)
        {
            int iMin = i;

            for (int j = (i + 1); j < n; j++)
            {
                if (Arr[j] < Arr[iMin])
                    iMin = j;
            }

            int temp = Arr[i];
            Arr[i] = Arr[iMin];
            Arr[iMin] = temp;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("SELECTION SORT ALGORITHM\n");

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

        SelectionSort(Arr);
        System.out.println("The sorted array: " + Arrays.toString(Arr));
    }
}