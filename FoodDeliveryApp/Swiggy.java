package FoodDeliveryApp;

import java.util.Scanner;

 class SwiggyUser {
    public static void main(String []arg){

        Scanner sc = new Scanner(System.in);
        FoodDeliveryApp user1 = new FoodDeliveryApp();
        System.out.print("Enter your food item price : ");
        user1.setPrice(sc.nextDouble());
        sc.nextLine();
        System.out.print("Enter your food item  name : ");
        user1.setItemName(sc.nextLine());
        System.out.print("Enter your category name : ");
        user1.setCategory(sc.nextLine());
        System.out.println(user1.displayItem());

    }
}

