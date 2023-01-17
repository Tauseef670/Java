package Java;
import java.util.*;

public class SearchOfElement {
    public static void main(String[] args) {
        int a[]=new int [5]; int n, count =0;
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
            
        }
        System.out.println("Enter Search Element");
        n=r.nextInt();

        for(int i=0; i<a.length ; i++)
        {
            if (a[i]==n)
            {
              count ++;  
            }
        }
        if (count > 0)
        {
            System.out.println("Item found");
        }
        else{
            System.out.println("item not found");
        }
    }
    
}
