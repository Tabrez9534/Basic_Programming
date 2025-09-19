package NewStudent;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Student {
    private String name;
    private int rollNo;
    private String course;

    Student(String name, int rollNo , String course)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    public void studentDetails()
    {
        if(name.isEmpty()){
            System.out.println("invalid name");
        }
        else if(rollNo<0){
            System.out.println("invalid Roll number");
        }
        else if(course.isEmpty()){
            System.out.println("invalid course");
        }
        System.out.println("Name: "+name);
        System.out.println("Roll no. : "+rollNo);
        System.out.println("Course : "+course);
    }
    public String getName()
    {
            return name;
    }

    public int getRollNo()
    {
            return rollNo;
    }
    public String getcourse() {
        return course;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        Student stu1 = new Student("Tabrez",-87,"JAVA");
       stu1.studentDetails();
    }

}
