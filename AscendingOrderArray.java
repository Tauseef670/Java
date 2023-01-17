package Java;
import java.util.*;
public class AscendingOrderArray {
    public static void main(String[] args) {
        int a[]=new int [5]; int sum=0; double avg; int temp;
        Scanner r = new Scanner (System.in);
        System.out.println("Enter Array Elements");

        for(int i=0;i<a.length;i++)
        {
            a[i]= r.nextInt();
        }
        System.out.println("Array elements");

        for(int i=0;i<a.length;i++)
        {
            for(int j = i+1;j<a.length;j++)
            {
                if (a[i]>a[j])
                {
                temp =a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            }

        }
        
        for(int i=0;i<a.length;i++)
        System.out.print(a[i] + " ");
    }

    
}
