public class Developer extends Employee{
    private String programmingLanguage = "";
    private int projectsCompleted = 0;

    public Developer(String employeeName, int employeeId, double employeeBaseSalary, String employeeDepartment, String programmingLanguage, int projectsCompleted) {
        super(employeeName, employeeId, employeeBaseSalary, employeeDepartment);
        this.programmingLanguage = programmingLanguage;
        this.projectsCompleted = projectsCompleted;
        System.out.println(name + " joined as a " + programmingLanguage + " Developer");
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (projectsCompleted * 1000);
    }

    @Override
    public void work() {
        System.out.println(name + " is coding in " + programmingLanguage);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Projects Completed: " + projectsCompleted);
    }
}
