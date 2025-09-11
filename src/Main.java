public class Main {
    public static void main(String[] args) {
        System.out.println("    EMPLOYEE MANAGEMENT SYSTEM    \n");

        Manager manager = new Manager("Alice Smith", 2004, 70000, "Engineering");
        Developer developer = new Developer("Bob Johnson", 2005, 80000, "Engineering", "Java", 5);
        Intern intern = new Intern("Charlie Brown", 2006, 40000, "Engineering", "Tech University", true);

        System.out.println();
        manager.displayInfo();
        manager.work();
        System.out.println("Monthly Salary: $" + manager.calculateSalary());

        System.out.println();
        developer.displayInfo();
        developer.work();
        System.out.println("Monthly Salary: $" + developer.calculateSalary());

        System.out.println();
        intern.displayInfo();
        intern.work();
        System.out.println("Monthly Salary: $" + intern.calculateSalary());
    }
}

