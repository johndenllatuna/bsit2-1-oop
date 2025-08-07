public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Johnden", 19, "Information Technology", 90, 90, 90);
        s1.displayInfo();

        Student s2 = new Student("Lauron", 20, "Information Technology", 85, 90, 86);
        s2.displayInfo();

        Student s3 = new Student("Lactuan", 22, "Information Technology", 70, 71, 68);
        s3.displayInfo();

        System.out.println("\nSummary: " + Student.passingStudents + " out of " + Student.totalStudents + " students are passing");
    }
}
