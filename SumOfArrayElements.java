package Java;

import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        
        int a[]=new int [5]; int sum=0;
        Scanner r = new Scanner (System.in);
        System.out.println("Enter Array Elements");

        for(int i=0;i<a.length;i++)
        {
            a[i]= r.nextInt();
        }
        System.out.println("Array Elements");
        for (int i=0; i<a.length ; i++)
        {
            System.out.println(a[i]);
            sum = a[i]+sum;
        }
        System.out.println("Additon of Array Elements" + sum);
    }
    
}
