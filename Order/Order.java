package Order;



public class Order {
    String itemName;
    double itemPrice;
    int quantity;
    String deliveryAddress;
    String paymentMethod;

    Order(String itemName, double itemPrice, int quantity, String deliveryAddress, String paymentMethod) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
        this.deliveryAddress = deliveryAddress;
        this.paymentMethod = paymentMethod;
    }

    public String orderDetails() {


        return "Item Name: " + itemName +
                "\nItem Price: " + itemPrice +
                "\nQuantity: " + quantity +
                "\nPayment Method: " + paymentMethod +
                "\nDelivery Address: " + deliveryAddress;
    }

    Order(Order newOrder, String paymentMethod, String deliveryAddress) {
        this.itemName = newOrder.itemName;
        this.itemPrice = newOrder.itemPrice;
        this.quantity = newOrder.quantity;
        this.paymentMethod = paymentMethod;
        this.deliveryAddress = deliveryAddress;


    }


    public static void main(String[] args) {

        Order order1 = new Order("Campa", 10, 5, "PATNA", "Online");
        Order order2 = new Order(order1, "Cash", "Delhi");
        System.out.println(order1.orderDetails());
        System.out.println();
        System.out.println(order2.orderDetails());

    }
}


