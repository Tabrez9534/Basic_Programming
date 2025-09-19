package Vehicle;

public class Vehicle {
    String ownerName;
    String model;
    String color;
    String registration;
    Vehicle(String ownerName , String model , String color , String registration){
        this.ownerName  = ownerName;
        this.model = model;
        this.color = color;
        this.registration = registration;

    }
    Vehicle(Vehicle car1 , String newOwner){
        this.ownerName = newOwner;
        this.model = car1.model;
        this.color = car1.color;
        this.registration = car1.registration;

    }

    public String showDetails(){
        return  "Owner Name : "+ownerName+
                "\nModel : "+model+
                "\nColor : "+color+
                "\nRegistration Number : "+registration+
                "\n";
    }
    public static void main(String[]args){
        Vehicle owner1 = new Vehicle("Tabrez","GTS400","Black","BR09K1234");
        Vehicle owner2 = new Vehicle(owner1,"Sania");
        System.out.println("-----------Original owner of the Car---------------\n"+owner1.showDetails()+"\n----------Sold to my man-------\n"+owner2.showDetails());

    }

}
