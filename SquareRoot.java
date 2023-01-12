import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        
        int n;
        System.out.println("Enter a Number");
        Scanner r = new Scanner(System.in);
        n=r.nextInt();
        double m = Math.sqrt(n);
        System.out.println("Square root of " + n+ " is " +m);
    }
    
}
