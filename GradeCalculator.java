import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Grade Calculator");

        // Input: Take marks obtained (out of 100) in each subject.
        System.out.print("Enter the number of subjects: ");
        int numSubjects = inputScanner.nextInt();

        int[] subjectMarks = new int[numSubjects];
        int totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            subjectMarks[i] = inputScanner.nextInt();
            totalMarks += subjectMarks[i];
        }

        // Calculate Total Marks: Sum up the marks obtained in all subjects.
        // Calculate Average Percentage: Divide the total marks by the total number of subjects.
        double averagePercentage = (double) totalMarks / numSubjects;

        // Grade Calculation: Assign grades based on the average percentage achieved.
        char grade = calculateGrade(averagePercentage);

        // Display Results: Show the total marks, average percentage, and the corresponding grade to the user.
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        inputScanner.close();
    }

    // Method to calculate grade based on average percentage.
    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
