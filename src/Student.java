public class Student {
    String name = "";
    int age = 0;
    String course = "";
    double grade1 = 0d;
    double grade2 = 0d;
    double grade3 = 0d;
    static int totalStudents = 0;
    static int passingStudents = 0;

    public Student(String sName, int sAge, String sCourse, double sGrade1, double sGrade2, double sGrade3){
        name = sName;
        age = sAge;
        course = sCourse;
        grade1 = sGrade1;
        grade2 = sGrade2;
        grade3 = sGrade3;
        totalStudents += 1;
    }

    void displayInfo(){
        System.out.println("\nName: " + name);
        System.out.println("Grades: " + grade1 + ", " + grade2 + ", " + grade3);
        System.out.println("Average: " + calculateAverage());
        getLetterGrade();
        if(isPassing()){
            System.out.println("Status: PASSING");
            passingStudents += 1;
        } else {
            System.out.println("Status: FAILING");
        }
    }

    double calculateAverage(){
        double allOverScore = grade1 + grade2 + grade3;
        return allOverScore / 3.0;
    }
    void getLetterGrade(){
        if(calculateAverage() >= 90){
            System.out.println("A");
        } else if (calculateAverage() >= 80 && calculateAverage() <= 89){
            System.out.println("B");
        } else if (calculateAverage() >= 70 && calculateAverage() <= 79){
            System.out.println("C");
        } else if (calculateAverage() >= 60 && calculateAverage() <= 69){
            System.out.println("D");
        } else if (calculateAverage() <= 60){
            System.out.println("F");
        }
    }


    boolean isPassing(){
        return calculateAverage() >= 70;
    }


}
