import java.util.Scanner;

public class ReportCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();

        // Input marks for three subjects
        System.out.print("Enter marks for Subject 1: ");
        int marks1 = scanner.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int marks2 = scanner.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int marks3 = scanner.nextInt();

        // Calculate total and average marks
        int totalMarks = marks1 + marks2 + marks3;
        double averageMarks = totalMarks / 3.0;

        // Display the report card
        System.out.println("\n--- Report Card ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
        System.out.println("Marks in Subject 3: " + marks3);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

        // Determine and display grade
        char grade;
        if (averageMarks >= 90) {
            grade = 'A';
        } else if (averageMarks >= 75) {
            grade = 'B';
        } else if (averageMarks >= 50) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("Grade: " + grade);
    }
}