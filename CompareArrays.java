package Java;
import java.util.*;
public class CompareArrays {
    public static void main(String[] args) {
        // We have 2 methods for comparing Arrays--
        // 1. ==  --> it provides wrong result because it compares with Arrays reference...
        // 2. equals to --> It provides correct result because it compares Data of the Array...

        int a[] = {10,20,30,40,50};
        int b[] = {10,20,30,40,50};

        // if(a==b)
        // {
        //     System.out.println("Both are equal");
        // }
        // else
        // {
        //     System.out.println("Both are not equal");
        // }

        if(Arrays.equals(a,b))
        {
            System.out.println("Both are equal");
        }
        else
        {
            System.out.println("Both are not equal");
        }
    }
    
}
