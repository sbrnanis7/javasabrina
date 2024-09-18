public class Person {

    private String name;
    private int year;
    private double GPA;

    public Person(String name, int year, double GPA) {
        this.name = name;
        this.year = year;
        this.GPA = GPA;

    }
    
    public void  displayDetails() {
        System.out.println("My name is: " + name);
        System.out.println("My age is: " + year);
        System.out.println("My gpa is " + GPA);
    }

    public static void main(String[] args) {
        Person person = new Person("selena", 35, 3.5);
        person.displayDetails();
       

    }

}

