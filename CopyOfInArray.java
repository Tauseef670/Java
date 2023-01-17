package Java;
import java.util.*;
public class CopyOfInArray {
    public static void main(String[] args) {

        //Copyof ---> This function copy one Array into other.

        int a[]=new int [5]; 
        Scanner r = new Scanner (System.in);
        System.out.println("Enter Array Elements");

        for(int i=0;i<a.length;i++)
        {
            a[i]= r.nextInt();
        }
        int a2[] = Arrays.copyOf(a,5);
        System.out.println("Data of Array2");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a2[i] + " ");
        }
    }
    
}
