package AmazonShopping;

public class ShoppingCart {

    public void addToCart(Product p , int qty){
        if(qty <= p.getQuantity() - qty){
            System.out.println(qty + " " +p.getName()+ " added To Cart ");
            System.out.println("Remaining "+p.getName() + " in Stock : "+p.getQuantity());
        }

    }
}
