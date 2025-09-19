package Book;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private double price;
    Book(String title , String author , double price){
        this.title = title ;
        this.author = author;
        this.price = price;
    }

    public double getTitle() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getPrice() {
        return title;
    }
    public void applyDiscount(double discountPercentage){
        if(discountPercentage < 0){
            System.out.println("Invalid discount ");
            System.out.println("Title: "+title);
            System.out.println("Author: "+author);
            System.out.println("Price: "+price);
        }
        else{
            System.out.println("Title: "+title);
            System.out.println("Author: "+author);
            System.out.println("Price: "+price);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book user1 = new Book("Annis tiles","George Orwell",14);
        user1.applyDiscount(-6);

    }
}
