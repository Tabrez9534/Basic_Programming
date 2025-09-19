package Naukri.com;

import java.util.Scanner;

class LoNaukri {

    String userName;
    Profile profile;
    LoNaukri (String userName , Profile profile){

        this.userName = userName;
        this.profile = profile;

    }

    public  String displayDetails(){
        return  "User Name : "+userName+
                "\nCandidate Name: "+profile.candidateName+
                "\nMobile No.: "+profile.mobileNo+
                "\nEmail ID :"+ profile.emailId+
                "\nDate Of Birth: "+profile.dob+
                "\nQualification: "+ profile.yoe+
                "\nSkill Set: "+ profile.skillSet+
                "\nAddress: "+ profile.address.streetName+
                "\nStreet Name: "+profile.address.streetName+
                "\nState: "+ profile.address.state+
                "\nCountry: "+profile.address.country;

    }
}

class Profile{
    String candidateName;
    long mobileNo;
    String emailId;
    String dob;
    String qualification;
    int yoe;
    String skillSet;
    Address address;
    Profile(String candidateName , long mobileNo ,String emailId,
            String dob , String qualification ,
            int yoe , String skillSet , Address address){
        this.candidateName = candidateName;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
        this.dob = dob;
        this.qualification = qualification;
        this.yoe = yoe;
        this.skillSet = skillSet;
        this.address = address;

    }

}
class Address {
    String streetName ;
    String state;
    String country;
    Address(String streetName , String state , String country){
        this.streetName= streetName;
        this.state= state;
        this.country= country;
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String userName = sc.next();
        System.out.print("Enter your name of candidate : ");
        String candidateName  = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter mobileNo.: ");
        long mobileNo = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter your mail id: ");
        String emailId = sc.nextLine();
        System.out.print("Enter Your date of birth in DD-MM-YYYY format: ");
        String dob = sc.nextLine();
        System.out.print("Enter your highest qualification : ");
        String qualification = sc.nextLine();
        System.out.print("Enter your skillSet: ");
        String skillSet = sc.nextLine();
        System.out.print("Enter the year of experience: ");
        int yoe = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter street name: ");
        String street = sc.nextLine();
        System.out.print("Enter state name: ");
        String state = sc.nextLine();
        System.out.print("Enter country name: ");
        String country = sc.nextLine();

        Address address1 = new Address(street,state,country);
        Profile profile1 = new Profile(candidateName , mobileNo,emailId ,
                                        dob,qualification,yoe,skillSet,address1);

        LoNaukri n1 = new LoNaukri(userName,profile1);
        System.out.println(n1.displayDetails());

    }
}
