public class Manager extends Employee {
    private double bonus = 0.0;
    private int teamSize = 0;

    public Manager(String employeeName, int employeeId, double employeeBaseSalary, String employeeDepartment){
        super(employeeName, employeeId, employeeBaseSalary, employeeDepartment);
        this.bonus = bonus;
        this.teamSize = teamSize;
        System.out.println(name + "has been promoted to Manager");
    }

    @Override
    public double calculateSalary(){
        return baseSalary + bonus;
    }

    @Override
    public void work(){
        super.work();
        System.out.println(name + " is managing a team of " + teamSize + " employees");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Team Size" + teamSize + " employees");
    }
}