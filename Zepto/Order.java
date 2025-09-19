package Zepto;

import java.util.Scanner;

public class Order {
    String orderId;
    String customerName;
    int deliveryTimeInMinutes;

    Order(String orderId, String customerName, int deliveryTimeInMinutes) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.deliveryTimeInMinutes = deliveryTimeInMinutes;


        if (deliveryTimeInMinutes < 1 || deliveryTimeInMinutes > 30) {

            System.out.println("Invalid delivery time! Setting default to 10 minutes.");
            this.deliveryTimeInMinutes = 10;  // default
        } else {
            this.deliveryTimeInMinutes = deliveryTimeInMinutes;
        }

    }

    // version 1 : No parameter
    public void trackOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Status: Preparing");
    }


    // Version 2: With current time
    public void trackOrder(int currentTime) {
        int timeLeft = deliveryTimeInMinutes - currentTime;
        System.out.println("Order ID: " + orderId);

        if (timeLeft <= 0) {
            System.out.println("Status: Delivered");
        } else if (timeLeft <= 5) {
            System.out.println("Status: Out for delivery");
            System.out.println("ETA: " + timeLeft + " minutes");
        } else {
            System.out.println("Status: Preparing");
            System.out.println("ETA: " + timeLeft + " minutes");
        }
    }


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        Order order1 = new Order( "ZP4567","Tabrez",10);

        order1.trackOrder(5); // 5 Minutes Passed
        System.out.println();
        Order order2 = new Order("SJDS89","Sania",5); // Already Delivered
        order2.trackOrder(6);
    }




}
