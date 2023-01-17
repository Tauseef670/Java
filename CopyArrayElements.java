package Java;

import java.util.Scanner;

public class CopyArrayElements {
    public static void main(String[] args) {
        // Size of both Array should be equal
        // Size of another Array can be bigger but can't be Smaller.
        int a[] = new int [5];
        int b[] = new int [10];
        Scanner r = new Scanner (System.in);
        System.out.println("Enter Elements in first Array");

        for (int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.println("first Array Elements");

        for(int i=0; i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Second Array Element");
        for(int i=0;i<a.length; i++)
        {
            b[i]=a[i];
            System.out.println(b[i]);
        }
    }
    
}
