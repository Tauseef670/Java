package Java;
import java.util.*;
public class equalsInArray {
    public static void main(String[] args) {
        // Equals () --> Compares 2 Arrays and say wether they are equal or not --

        int a[]=new int [5]; 
        int a2[]=new int [5]; 
        Scanner r = new Scanner (System.in);
        System.out.println("Enter Array Elements Array 1");

        for(int i=0;i<a.length;i++)
        {
            a[i]= r.nextInt();
        }

        System.out.println("Enter Array Elements Array 2");

        for(int i=0;i<a2.length;i++)
        {
            a2[i]= r.nextInt();
        }
        boolean b = Arrays.equals(a,a2);
        System.out.println("kya dono Arrays Equals hain :" + b);
    }
    
}
