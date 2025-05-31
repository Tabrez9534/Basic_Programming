package javaInput;
import java.util.Scanner;
public class areaofaacircle {
    public static void main(String[] args) {
        Scanner lo= new Scanner(System.in);
//        System.out.print("Enter the value of : ");
//        System.out.println("Enter the value of: ");
//        System.out.println("Enter the value of :");
//        int x;
//        x = lo.nextInt();
//        double pi = 3.1415;
//
//
//        double area= pi * x * x;
//        System.out.println("The area of a circle is :> "+area);
//        double tt= lo.nextDouble();
//        System.out.println("The value of a circle is :> "+area);
        double pi=lo.nextDouble();
        double height=lo.nextDouble();
        double r=lo.nextDouble();

        double o=2*pi*r*height+2*pi*r*r;
        System.out.println("The value of surface area of a triangle :> "+o);

    }
}

