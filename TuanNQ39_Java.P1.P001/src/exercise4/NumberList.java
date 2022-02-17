package exercise4;

import java.util.Scanner;

public class NumberList {
	public static void main(String[] args)
    {
        int total, sort, i;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array :");
        total = s.nextInt();

        int a[] = new int[total];
        System.out.println("Enter " + total + " elements ");
        for( i=0; i < total; i++) {
            a[i] = s.nextInt();
        }

        System.out.println( "Elements in array : ");
        print(a);

        System.out.print("\nChoose sort :\n1.QuickSort\n2.SelectionSort\n3.InsertSort\n");
        sort = s.nextInt();

        if(sort == 1) {
            QuickSort ss = new QuickSort();
            ss.sort(a, 0, total -1);
            print(a);
        }

        if(sort == 2) {
            SelectionSort ss = new SelectionSort();
            ss.sort(a);
            print(a);
        }

        if(sort == 3) {
            InsertionSort is = new InsertionSort();
            is.sort(a);
            print(a);
        }
    }

    public static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");
        }
    }
}
