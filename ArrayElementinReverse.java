package Java;
import java.util.*;
public class ArrayElementinReverse {
    public static void main(String[] args) {
        
        int a[]=new int[5];
        Scanner c = new Scanner (System.in);
        System.out.println("Enter elements in array");
        for (int i=0;i<a.length; i++)
        {
            a[i] =c.nextInt();
        }
        System.out.println("Array elements");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i] + " ");
        }

        System.out.println(" Array reverse elements");
        for (int i=a.length-1; i>=0;i--)
        {
            System.out.println(a[i]+" ");
        }


    }
    
}
