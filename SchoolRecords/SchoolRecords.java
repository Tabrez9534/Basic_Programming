package SchoolRecords;

public class SchoolRecords {
    String name;
    int age;
    int gradeLevel;
    String schoolName;
    SchoolRecords(String name , int age , int gradeLevel , String schoolName ){
        this.name = name;
        this.age = age;
        this.gradeLevel = gradeLevel;
        this.schoolName = schoolName;
    }
    public String recodeDetails(){

        return   "Name: "+name+
                "\nAge: "+age+
                "\nGrade Level: "+gradeLevel+
                "\nSchool Name: "+schoolName;
    }
    SchoolRecords(SchoolRecords sc){
        name = sc.name;
        age = sc.age;
        this.gradeLevel = sc.gradeLevel+1;
        schoolName = sc.schoolName;



    }
    public static void main(String[]args){
        SchoolRecords stu1 = new SchoolRecords("Tabrez",24,1,"Sviet");
        SchoolRecords stu2 = new SchoolRecords(stu1);
        System.out.println("------------------Original Student-------------------");
        System.out.println(stu1.recodeDetails());
        System.out.println();
        System.out.println("-----------------Promoted Student-----------------");
        System.out.println(stu2.recodeDetails());

    }
}
