public class Employee {
    private String name;
    private double[] salary; // base Salary
    private double hAllowance; // health allowance
    private double tAllowance; // transport allowance
    private double bonus; 
    private double totalSalary;




    public Employee(String name, double[] baseSalary) {  //constructor
        this.name = name;
        this.salary = salary; 
        this.hAllowance = 0;
        this.tAllowance = 0;
        this.bonus = 0;
        this.totalSalary = 0;

    }

    public String getName() { 
        return name;
    }

    public double[] getSalary() {
        return salary;
    }

    public double totalSalary() { //compute the total salary
        double total = 0;
        for (double s : salary) {
            total += s;
        }
        return total;
    }

    public void calculateBonus() {  // method to assign bonus based on base salary
        double salaryTotal = totalSalary();
        if (salaryTotal > 50000) {
            bonus = (0.1*totalSalary);
        } else if (salaryTotal > 30000) {
            bonus = (0.05*totalSalary);
        } else {
            bonus = (0+totalSalary);
        }
    }

}


