package Java;
import java.util.*;
public class AverageOfArrayElements {
    public static void main(String[] args) {
        int a[]=new int [5]; int sum=0; double avg;
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
        for (int i=0; i<a.length ; i++)
        {
            System.out.println(a[i]);
            sum = a[i]+sum;
        }
        avg = sum/a.length;
        System.out.println(sum+" "+ avg);

    }
    
}
