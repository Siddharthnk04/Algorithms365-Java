import java.util.*;

public class StudentResultSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int students;
        int highestTotal = 0;
        int highestStudent = 0;

        System.out.print("Enter number of students: ");
        students = sc.nextInt();

        for (int student = 1; student <= students; student++) {

            System.out.println("\n----- Student " + student + " -----");

            System.out.print("Enter student age: ");
            int age = sc.nextInt();

            if (age < 0) {
                System.out.println("Invalid age.");
                continue;
            }

            int total = 0;
            boolean failed = false;

            for (int subject = 1; subject <= 5; subject++) {

                System.out.print("Enter marks for subject " + subject + ": ");
                int marks = sc.nextInt();

                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid marks.");
                    subject--;
                    continue;
                }

                total = total + marks;

                if (marks < 35) {
                    failed = true;
                }
            }

            double percentage = total / 5.0;

            char grade;

            if (failed) {
                grade = 'F';
            }
            else if (percentage >= 90) {
                grade = 'A';
            }
            else if (percentage >= 75) {
                grade = 'B';
            }
            else if (percentage >= 60) {
                grade = 'C';
            }
            else if (percentage >= 35) {
                grade = 'D';
            }
            else {
                grade = 'F';
            }

            System.out.println("\nTotal      = " + total);
            System.out.println("Percentage = " + percentage);
            System.out.println("Grade      = " + grade);

            if (failed) {
                System.out.println("Result     = FAIL");
            }
            else {
                System.out.println("Result     = PASS");
            }

            if (total > highestTotal) {
                highestTotal = total;
                highestStudent = student;
            }

            System.out.println("\nChoose an option:");

            System.out.println("1. Show result");
            System.out.println("2. Check eligibility");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Student " + student +
                            " scored " + total + " marks.");
                    break;

                case 2:

                    if (age >= 18 && !failed) {
                        System.out.println("Eligible.");
                    }
                    else {
                        System.out.println("Not eligible.");
                    }

                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        System.out.println("\n==========================");
        System.out.println("Highest Scoring Student");
        System.out.println("==========================");

        System.out.println("Student : " + highestStudent);
        System.out.println("Marks   : " + highestTotal);

        sc.close();
    }
}