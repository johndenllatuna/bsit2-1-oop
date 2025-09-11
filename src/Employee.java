public class Employee {
    protected String name = "";
    protected int Id = 0;
    protected double baseSalary = 0.0;
    protected String department = "";

    public Employee(String employeeName, int employeeId, double employeeBaseSalary, String employeeDepartment){
        this.name = employeeName;
        this.Id = employeeId;
        this.baseSalary = employeeBaseSalary;
        this.department = employeeDepartment;
        System.out.println("Employee " + name + " has been hired in " + department + "  department");
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Employee Id: " + Id);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Department: " + department);
    }

    public double calculateSalary(){
        return baseSalary;
    }

    public void work(){
        System.out.println(name + "is working on general tasks");
    }
}


