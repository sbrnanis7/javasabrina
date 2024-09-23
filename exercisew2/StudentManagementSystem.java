package exercisew2;

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
}
