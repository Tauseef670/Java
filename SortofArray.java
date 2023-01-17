package Java;

import java.util.*;

public class SortEqualsCopyofArray {
    public static void main(String[] args) {
        //Sort () --> Automatically sort Array in Ascending or Descending Order--

        int a[]=new int [5]; int sum=0; double avg; int temp;
        Scanner r = new Scanner (System.in);
        System.out.println("Enter Array Elements");

        for(int i=0;i<a.length;i++)
        {
            a[i]= r.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    
}
