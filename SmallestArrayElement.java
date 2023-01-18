package Java;
import java.util.*;
public class SmallestArrayElement {
    public static void main(String[] args) {
        int a[]=new int[5]; int Min;
        Scanner r = new Scanner (System.in);
        System.out.println("Enter Array Elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        Min=a[0];
        for(int i=1; i<a.length;i++)
        {
            if (a[i]<Min)
            {
                Min = a[i];
            }
        }
        System.out.println("Smallest Element"+ Min);
    }
    
}
