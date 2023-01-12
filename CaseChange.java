import java.util.Scanner;
import java.util.*;
public class CaseChange {
    public static void main(String[] args) {
        
        char ch,ch2;
        System.out.println("Enter any character");
        Scanner r = new Scanner(System.in);
        ch=r.next().charAt(0);


        if (ch >='A' && ch <= 'Z')
        {
            ch2 = Character.toLowerCase(ch) ;
            System.out.print("LowerCase"+ ch2);
        }
        else
        {
            ch2 = Character.toUpperCase(ch);
            System.out.print("UpperCase"+ ch2);
        }


    }
    
}
