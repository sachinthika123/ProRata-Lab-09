import java.util.Scanner;

public class IT22619976Lab9Q4 {

    // Calculate Final Mark
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 30 / 100) + (examMark * 70 / 100);
    }

    // Find Grade
    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // Print Student Details
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.println("Name: " + name);
        System.out.printf("Final Mark: %.2f%n", finalMark);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.println("Student " + i);

            System.out.print("Enter Name: ");
            String name = input.nextLine();

            System.out.print("Enter Assignment Mark: ");
            double assignmentMark = input.nextDouble();

            System.out.print("Enter Exam Paper Mark: ");
            double examMark = input.nextDouble();

            input.nextLine();

            double finalMark = calcFinalMark(assignmentMark, examMark);
            char grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);
        }
    }
}