package exercisew2;

public class Student {
    private String name;
    private int[] scores;
    private double averageScore;

    public Student(String name, int[] scores) {  //constructor
        this.name = name;
        this.scores = scores;
        this.averageScore = calculateAverage(); //to calculate average
    }

    public String getName() { 
        return name;
    }

    public int[] getScores() {
        return scores;
    }

    public double calculateAverage() { //method to compute the average score
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total / (double) scores.length; // Ensure division is done as double
    }

    // Method to assign grade based on average score
    public String assignGrade() {
        double avg = calculateAverage();
        if (avg >= 90) {
            return "A";
        } else if (avg >= 80) {
            return "B";
        } else if (avg >= 70) {
            return "C";
        } else if (avg >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

