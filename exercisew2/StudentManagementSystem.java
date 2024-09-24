import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize an array to store student names
        String[] studentNames = new String[5];

        // Initialize arrays to store scores for each student
        int[][] studentScores = new int[5][3]; // Assuming 3 subjects: Math, Science, English

        // Input: Get student names and scores
        for (int i = 0; i < studentNames.length; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            System.out.print("Enter Math score: ");
            studentScores[i][0] = scanner.nextInt();

            System.out.print("Enter Science score: ");
            studentScores[i][1] = scanner.nextInt();

            System.out.print("Enter English score: ");
            studentScores[i][2] = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
        }

        // Calculate average scores and assign grades
        char[] studentGrades = new char[5];
        for (int i = 0; i < studentNames.length; i++) {
            double averageScore = (studentScores[i][0] + studentScores[i][1] + studentScores[i][2]) / 3.0;
            studentGrades[i] = assignGrade(averageScore);
        }

        // Display student summary
        System.out.println("\nStudent Summary:");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("Name: " + studentNames[i]);
            System.out.println("Average Score: " + calculateAverage(studentScores[i]));
            System.out.println("Grade: " + studentGrades[i]);
            System.out.println("-------------------------");
        }

        scanner.close();
    }

    // Helper method to calculate average score
    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum / (double) scores.length;
    }

    // Helper method to assign grades
    public static char assignGrade(double averageScore) {
        if (averageScore >= 90) {
            return 'A';
        } else if (averageScore >= 80) {
            return 'B';
        } else if (averageScore >= 70) {
            return 'C';
        } else if (averageScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}


/*package exercisew2;

import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5]; // Array 5 students

        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter scores for Math, Science, and English separated by spaces: ");
            String[] scoreStrings = scanner.nextLine().split(" ");
            int[] scores = new int[scoreStrings.length];

            for (int j = 0; j < scoreStrings.length; j++) {
                scores[j] = Integer.parseInt(scoreStrings[j]); // Convert input to integer
            }

            students[i] = new Student(name, scores); // Create a new student and add to the array
        }

        // Loop to display each student's name, average score, and grade
        System.out.println("\nStudent Summary:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Average Score: " + student.calculateAverage());
            System.out.println("Grade: " + student.assignGrade());
            System.out.println("-------------------------");
        }

        scanner.close();
    }
} */
