import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        
        //input 153 --> (1*1*1 + 5*5*5 + 3*3*3) = 153

        int n,c,arm=0,rem;
        System.out.println("Enter any number");
        Scanner r = new Scanner(System.in);
        n=r.nextInt();
        c=n;

        while(n>0)
        {
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
            if (c==arm)
            System.out.println("Armstrong number");
            else
            System.out.println("Not a Armstrong number");

        }

    }
    

