import java.util.Scanner;

public class Asciivalue {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter any character");
        Scanner r = new Scanner(System.in);
        ch=r.next().charAt(0);
        int a=ch;
        System.out.println("Ascii value of "+ch +" is " +a);
    }
    
}
