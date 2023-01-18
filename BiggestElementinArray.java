package Java;

import java.util.Scanner;

public class BiggestElementinArray {
    public static void main(String[] args) {
        int a[]=new int[5]; int Max;
        Scanner r = new Scanner (System.in);
        System.out.println("Enter Array Elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        Max=a[0];
        for(int i=1; i<a.length;i++)
        {
            if (a[i]>Max)
            {
                Max = a[i];
            }
        }
        System.out.println("Maximum Element"+ Max);
        
    }
    
}
