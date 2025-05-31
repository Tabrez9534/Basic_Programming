import java.util.Scanner;

class Swap {
     public static void main(String[] args) {
         Scanner st= new Scanner(System.in);
         System.out.print("Welcome to swapping station  --> \n\n ");
         System.out.print("Enter the value of A --> ");
         int A= st.nextInt();
         System.out.print("Enter the value of B --> ");
         int B= st.nextInt();
         int C= A;
         A=B;
         B=C;
         System.out.println("Swapping done.....");
         System.out.println("value of A is : " +A);
         System.out.println("value of B is --> " +B);



     }
}
