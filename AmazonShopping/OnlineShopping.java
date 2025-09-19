package AmazonShopping;

public class OnlineShopping {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setName("Laptop");
        p1.setPrice(50000.0);
        p1.setQuantity(5);
        System.out.println(p1.getDetails());
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(p1 , 2);
    }
}
