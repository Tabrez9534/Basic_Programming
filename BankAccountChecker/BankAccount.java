package BankAccountChecker;

import java.util.Scanner;

public class BankAccount {
//    Getter and Setter Methods
//Write a Java program to implement getter and setter methods.
//•	Create a class BankAccount with a private variable balance.
//•	Write a getter method to return the balance.
//•	Write a setter method to update the balance (but ensure balance cannot be set to a negative value).
//•	In the main method, create an object of BankAccount, use the setter to set a balance, and then display it using the getter.

//Sample Input
//5000
//Sample Output
//Balance after setting: 5000.0
//Explanation


//5000

//Expected Output:
//Balance after setting: 5000.0

//-3000

//Expected Output:
//Balance cannot be negative!

//10000

//Expected Output:
//Balance after setting: 10000.0

//0

//Expected Output:
//Balance after setting: 0.0

    private double balance;
    public  void setBalance(double balance){
        if(balance < 0){
            System.out.println("Invalid input , Because balance can not be negative ");
            System.exit(0);
        }
        else {
            this.balance = balance;
        }
    }

    public  double getBalance(){
        return balance;
    }
    public static void main(String[]args){
        BankAccount user1 = new BankAccount();
        System.out.print("Please Enter Your balance : ");
        Scanner sc = new Scanner(System.in);
        user1.setBalance(sc.nextDouble());
        System.out.println("Balance after getting: "+user1.getBalance());

    }
}
