package javaInput;
import java.util.Scanner;
public class sumOf2numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the first value :> ");
        int x=sc.nextInt();
        System.out.println("Enter the second value:> ");
        double y=sc.nextDouble();
        System.out.println(x+y);
        System.out.println(x/y);
        System.out.println("Enter the third value" );
        double t=sc.nextInt();
        System.out.println("Enter the fourth value");
        double s=sc.nextDouble();
        System.out.println(t-s);
        System.out.println(t+s);



    }
}