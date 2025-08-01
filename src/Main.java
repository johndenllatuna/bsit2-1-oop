import java.util.Scanner;

public class Main {

    static int number = 0;
    static int totalNumber = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 5; i++){
            System.out.print("Enter Number " + i + ": ");
            number = scanner.nextInt();
            totalNumber = totalNumber + number;
        }

        System.out.println("\nTotal Number: " + totalNumber);
        scanner.close();
    }
}