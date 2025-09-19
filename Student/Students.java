package Student;

import java.util.Scanner;

public class Students {
    String name;
    static String schoolName = "ABC Public School";


    public static void main(String[] args) {
        Students stu1 = new Students();
        Students stu2 = new Students();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your name : ");

        System.out.println(stu1.name = sc.nextLine());
        System.out.println(schoolName);
        System.out.println();

        System.out.print("Enter Your name : ");
        System.out.println(stu1.name = sc.nextLine());
        System.out.println(schoolName);




    }
}
