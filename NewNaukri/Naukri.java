package NewNaukri;


import java.util.Scanner;

public class Naukri {
    String userId;
    Profile profile;

    Naukri(String userName , Profile profile){

        this.userId = userName;
        this.profile  = profile;
    }

    public  String displayDetails(){
        return "Candidate Name:  "+userId+
                "\nRoll No.: "+ profile.rollNumber+
                "\nMail id:  "+profile.mailId+
                "\nDate of Birth: "+profile.dob+
                "\nHighestQualification: "+profile.highestQualification+
                "\nYear of Experience: "+profile.experience+
                "\nStreet: "+ profile.address.street+
                "\nCity: "+ profile.address.city+
                "\nState: "+profile.address.state;
    }

}
class Profile{
    String candidateName;
    long rollNumber;
    String mailId;
    String dob;
    String highestQualification;
    int experience;
    Address address;

    Profile(String candidateName ,long rollNumber , String mailId , String dob , String highestQualification ,
                                                                      int experience , Address address)
    {
        this.candidateName = candidateName;
        this.rollNumber = rollNumber;
        this.mailId = mailId;
        this.dob = dob;
        this.highestQualification = highestQualification;
        this.experience = experience;
        this.address = address;

    }

}

class Address{
    String street;
    String city;
    String state;

    Address (String street , String city , String state ){

        this.street = street;
        this.city = city;
        this.state = state;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter user name: ");
        String userId = sc.next();
        System.out.print("Enter your candidate Name : ");
        String candidate = sc.next();
        System.out.print("Enter your roll No.");
        long rollNumber = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter your mail id:  ");
        String mainId = sc.next();
        System.out.print("Enter Year of birth: ");
        String dob = sc.next();
        System.out.print("Enter your highest Qualification: ");
        String highestQualification = sc.next();
        sc.nextLine();
        System.out.print("Enter your year of experience :");
        int experience = sc.nextInt();
        System.out.print("Enter your street: ");
        String street = sc.next();
        System.out.println("Enter your city: ");
        String city = sc.next();
        System.out.print("Enter your state: ");
        String state = sc.next();
        Address address1 = new Address(street,city,state);
        Profile profile1 = new Profile(candidate , rollNumber , mainId , dob , highestQualification , experience , address1);
        Naukri n1 = new Naukri(userId , profile1);
        System.out.println(n1.displayDetails());
    }
}
