package Java;

import java.util.Scanner;

public class InsertIteminArray {
    public static void main(String[] args) {
        int size,loc,item,i;
        Scanner r = new Scanner (System.in);
        System.out.println("Enter Array Size");
        size = r.nextInt();

        int a[] = new int [size+1];
        System.out.println("Enter Array elements");
        for( i=0;i<a.length;i++)
        {
           a[i]=r.nextInt(); 
        }
        System.out.println("Enter Array location");
        loc = r.nextInt();
        System.out.println("Enter new item");
        item=r.nextInt();

        for(i=size;i>loc;i--)
        {
            a[i]=a[i-1];
        }
        a[loc] = item;
        size++;

        for( i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }
    }
    
}
