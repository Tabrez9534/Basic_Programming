package javaInput;
import java.util.Scanner;
public class moduloRemainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter dividend:> ");
//        int a=sc.nextInt();
//        System.out.println("Enter divisor :> " );
//        int b= sc.nextInt();
//        int r=a%b;
//        System.out.println("The remainder when "+a+" is divided by "+b+" is "+r+" ");
////    9%69=9 answer hoga ( b%a =b [where b<a] )
////      (  a%-b=a%b   same )
       int n=sc.nextInt();
        System.out.println(n%2);
    }
}
