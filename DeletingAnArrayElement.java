package Java;
import java.util.*;
public class DeletingAnArrayElement {
    public static void main(String[] args) {
        int size,loc,i;
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

        for(i=loc;i<size;i++)
        {
            a[i]=a[i+1];
        }
        size--;
        for( i=0;i<a.length;i++)
        {
           System.out.print(a[i] + " ");
        }
    }
    
}
