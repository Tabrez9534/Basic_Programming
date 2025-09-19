package LinkedInProfile;

import java.util.Scanner;

public class LinkedIn {
    static Scanner sc = new Scanner(System.in);
    public  static void createProfile(Profile P ,Address a){
        P.address = a;
        System.out.print("Enter Your name : ");
        P.name = sc.nextLine();
        System.out.print("Enter your designation : ");
        P.designation = sc.nextLine();
        System.out.print("Enter Your street name : ");
        P.address.streetName = sc.nextLine();
        System.out.print("Enter State name : ");
        P.address.streetName = sc.nextLine();
        System.out.print("Enter Your Country name : ");
        P.address.country = sc.nextLine();
        System.out.print("Enter webpage Link : ");
        P.webpage = sc.nextLine();

        System.out.print("Enter the University name : ");
        P.universityName = sc.nextLine();

    }
    public static  void follow(Profile p1 , Profile p2){
        System.out.print(p1.name + " Following "+p2.name);
        p2.connections++;
    }
    public void connect (Profile p1 ,Profile p2){
        System.out.print("Request Sent for connections ");
    }
    public static String viewProfile(Profile P){
        return "Name : "+P.name+
                "\nDesignation : "+P.designation+
                "\nWenPage : "+P.webpage+
                "\nStreetName : "+P.address.state+
                "\nState : "+P.address.state+
                "\nCountry : "+P.address.country+
                "\nConnection : "+P.connections+
                "\nUniversity : "+P.universityName;
    }
}
