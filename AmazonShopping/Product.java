package AmazonShopping;

public class Product {
    private  String name;
    private double price;
    private int quantity;

    public void setName(String name){
        this.name = name;

    }
    public void setPrice (double price){
        if(price > 0){
            this.price = price;

        }
        else {
            System.err.println("Invalid Input");
            System.exit(0);
        }
    }
    public void setQuantity(int quantity){
        if(quantity > 0){
            this.quantity = quantity;

        }
        else {
            System.err.println("invalid quantity");
            System.exit(0);
        }
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public String getDetails(){
        return "Product name : "+name+
                "\nPrice : " +price+
                "\nQuantity : "+quantity;
    }
}
