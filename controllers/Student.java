public class Student {
    private String name;         // encapsulation method, declare private variables
    private int scores[] = {0,0,0}; //0 default value
    private double averageScore; 

    public Student(String name, int[] scores){
        this.name = name; 
        this.scores = scores;
    }

    public void setStudent(String name, int[] scores){
        this.name = name; 
        this.scores = scores;
    }

    public String getName(){
        return name;
    }
    public int[] getScores(){
        return scores;
    }

    public double calculateAverage(){
        int total = 0;

        for (int score: scores){
            total = total + score;
        }
        averageScore = total / 3;
        return averageScore;
    }

    public String assignGrade(){
        String grade = "";

        if(averageScore >= 90){
            grade = "A";
        }
        if(averageScore >= 80 && averageScore <= 89 ){
            grade = "B";
        }
        if(averageScore >= 70 && averageScore <= 79){
            grade = "C";
        }
        if(averageScore >= 60 && averageScore <= 69){
            grade = "D";
        }
        if(averageScore <= 60){
            grade = "F";
        }

        return grade;
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student("Sabrina",  new int[]{88, 99, 90});
        students[1] = new Student("Rara",  new int[]{76, 79, 94});
        students[2] = new Student("Khai",  new int[]{74, 98, 74});
        students[3] = new Student("Farees",  new int[]{81, 91, 83});
        students[4] = new Student("Sarah",  new int[]{97, 74, 83});

        for (int i = 0; i<students.length; i++){
            System.out.println("\nStudents: " + students[i].getName() + "\nAverage score: " + students[i].calculateAverage() + "\nGrade: " + students[i].assignGrade());
        }
    }

}
