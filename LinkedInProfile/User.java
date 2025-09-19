package LinkedInProfile;

public class User {
    public static void main(String[]args){
        Profile profile1 = new Profile(); // ref 1010
        Address address1 = new Address();


        Profile profile2 = new Profile();
        Address address2 = new Address(); // ref 2020

        LinkedIn.createProfile(profile1,address1); // ref 1010

//        LinkedIn.createProfile(profile2,address2); // ref 2020
        System.out.println(LinkedIn.viewProfile(profile1));

    }
}
