package Java;
import java.util.*;
public class lenghtOfArray {
    public static void main(String[] args) {
        
        int a[]= new int[10];
        Scanner r = new Scanner(System.in);

        System.out.println("Enter Array Elements");

        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.println("Array Elements");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i] + " ");
        }
        System.out.println("Array length"+ a.length);

    }
    
}
