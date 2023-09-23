import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        int totalSubjects;
        int totalMarks = 0;
        double averagePercentage;
        char grade;

        // Prompt user for the total number of subjects
        System.out.print("Enter the total number of subjects: ");
        totalSubjects = scanner.nextInt();

        // Prompt user for marks in each subject
        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter marks (out of 100) for Subject " + i + ": ");
            int marks = scanner.nextInt();

            // Check if marks are valid (between 0 and 100)
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                i--; // Decrement i to re-enter marks for the same subject
            } else {
                totalMarks += marks;
            }
        }

        // Calculate average percentage
        averagePercentage = (double) totalMarks / totalSubjects;

        // Assign grades based on average percentage
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        // Close the scanner
        scanner.close();
    }
}
