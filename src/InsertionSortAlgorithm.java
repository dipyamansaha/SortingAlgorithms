// INSERTION SORT ALGORITHM

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortAlgorithm
{
    static void InsertionSort(int[] Arr)
    {
        int n = Arr.length;

        for(int i = 1; i < n; i++)
        {
            int value = Arr[i];
            int hole = i;

            while((hole > 0) && (Arr[hole - 1] > value))
            {
                Arr[hole] = Arr[hole - 1];
                hole--;
            }

            Arr[hole] = value;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("INSERTION SORT ALGORITHM\n");

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

        InsertionSort(Arr);
        System.out.println("The sorted array: " + Arrays.toString(Arr));
    }
}