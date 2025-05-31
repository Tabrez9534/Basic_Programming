package javaInput;

import java.util.Scanner;

public class userInput {
      public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name=input.nextLine();
//        System.out.println("welcome " +name+ " to kg coding" );


          // add two number
          System.out.print("enter the first number: ");
          int firstNumber=input.nextInt();
          System.out.print("enter the second number: ");
          int secondNumber= input.nextInt();
          System.out.println("the some of two number " +firstNumber+secondNumber);
          System.out.println("the subtract of two number "+(firstNumber-secondNumber));
          System.out.println("the multiple of two number " +firstNumber*secondNumber);
          System.out.println("the division of two number "+firstNumber%secondNumber);



    }
}
