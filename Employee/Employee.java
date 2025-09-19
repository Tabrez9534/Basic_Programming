package Employee;



public class Employee {
    private String empName;
    private int empId;
    private double salary;
    Employee(String empName , int empId , double salary){
        this.empName = empName;
        this.empId = empId;
        this.salary = salary;
    }
    public String getEmpName(){
        return empName;

    }
    public int getEmpId(){
        return empId;
    }
    public  double getSalary(){
        return salary;
    }
    public  void EmpDetails(){
        if(empName.isEmpty()){
            System.err.println("Invalid empName:");
        }
        else if(empId < 0){
            System.err.println(" Invalid Employee Id");
        }
        else if(salary < 0){
            System.err.println("Invalid Salary Is: "+salary);
        }
        else {
            System.out.println("Employee Name: "+getEmpName());
            System.out.println("Employee id: "+getEmpId());
            System.out.println("Employee Salary: "+getSalary());

        }

    }

    public static void main(String[] args) {


        Employee emp1 = new Employee(" ", 22 , 483983.0);
        emp1.EmpDetails();
    }
}
