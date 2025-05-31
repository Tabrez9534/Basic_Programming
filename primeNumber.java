import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first integer :> ");
        int a = sc.nextInt();
        if (a / 2 == 0 && a % 3 == 0 && a/5==0) {
            System.out.println(a + " is a prime number");

        }
        else {
            System.out.println(a + "is not a prime number");

        }
    }




    }


