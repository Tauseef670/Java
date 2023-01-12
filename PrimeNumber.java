import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        // Number divisible by 1 and itself and set remainder 0 is called Prime number.

        int n , count=0;
        System.out.println("Enter a number");
        Scanner r= new Scanner (System.in);
        n=r.nextInt();
        for (int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if (count ==2)
        System.out.println("Prime number");
        else
        System.out.println("Not a prime number");
    }
    
}
