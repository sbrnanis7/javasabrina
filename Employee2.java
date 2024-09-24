// public class Employee2 {

//         private String name;
//         private double[] salary; // base Salary
//         private double hAllowance = 500; // health allowance
//         private double tAllowance = 250; // transport allowance
//         private double bonus; 
//         private double totalSalary;
    
//         public Employee2(String name, double[] baseSalary) {  //constructor
//             this.name = name;
//             this.salary = salary; 
//             this.hAllowance = 500;
//             this.tAllowance = 250;
//             this.bonus = 0;
//             this.totalSalary = 0;
//         }
    
//         public String getName() { 
//             return name;
//         }
    
//         public double[] getSalary() {
//             return salary;
//         }
    
//         public double totalSalary() { //compute the total salary
//             double total = 0;
//             for (double s : salary) {
//                 total += s;
//             }
//             return total;
//         }
    
//         public void calculateBonus() {  // method to assign bonus based on base salary
//             double salaryTotal = totalSalary();
//             if (salaryTotal > 5000) {
//                 bonus = (0.1*totalSalary);
//             } else if (salaryTotal > 3000) {
//                 bonus = (0.05*totalSalary);
//             } else {
//                 bonus = (0+totalSalary);
//             }
//         }

//         public static void main(String[] args) {
//             Employee2[] employees = new Employee[5];
    
//             employees[0] = new employee("Farees",  new int[]{5500,500,250});
//             employees[1] = new employee("Maimoon",  new int[]{7500,500,250});
//             employees[2] = new employee("Sabri",  new int[]{4500,500,250});
//             employees[3] = new employee("Syahir",  new int[]{6500,500,250});
//             employees[4] = new employee("Khai",  new int[]{3500,500,250});
    
//             for (int i = 0; i<employees.length; i++){
//                 System.out.println("\nEmployees: " + employees[i].getName() + "\nTotal Salary: " + employees[i].calculateBonus() + "\nBonus: " + employees[i].totalSalary());
//             }
//         }

       
    
    
    
// }


public class Employee2 {
    private String name;
    private double[] salary; // base Salary
    private double hAllowance = 500; // health allowance
    private double tAllowance = 250; // transport allowance
    private double bonus;
    private double totalSalary;

    public Employee2(String name, double[] baseSalary) {
        this.name = name;
        this.salary = baseSalary; // Assign the parameter to the field
        this.bonus = 0; // Initialize other fields as needed
        this.totalSalary = 0;
    }

    public String getName() {
        return name;
    }

    public double[] getSalary() {
        return salary;
    }

    public double calculateBonus() {
        double salaryTotal = totalSalary();
        if (salaryTotal > 5000) {
            bonus = 0.1 * salaryTotal;
        } else if (salaryTotal > 3000) {
            bonus = 0.05 * salaryTotal;
        } else {
            bonus = 0; // No bonus if salary <= 3000
        }
        return bonus;
    }

    public double totalSalary() {
        double total = 0;
        for (double s : salary) {
            total += s;
        }
        return total + hAllowance + tAllowance + bonus;
    }

    public static void main(String[] args) {
        Employee2[] employees = new Employee2[5];

        try{

        employees[0] = new Employee2("Farees", new double[]{5500, 500, 250});
        employees[1] = new Employee2("Maimoon", new double[]{7500, 500, 250});
        employees[2] = new Employee2("Sabri", new double[]{4500, 500, 250});
        employees[3] = new Employee2("Syahir", new double[]{6500, 500, 250});
        employees[4] = new Employee2("Khai", new double[]{3500, 500, 250});

        System.out.println(employees[7]);
        

        for (Employee2 emp : employees) {
            System.out.println("\nEmployee: " + emp.getName());
            System.out.println("Total Salary: RM" + emp.totalSalary());
            System.out.println("Bonus: RM" + emp.calculateBonus());
        }

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught bad " + e.getMessage());

        } finally {
            System.out.println("It will be executed anyway");
        }

        System.out.println("Program is continuing");
    }
}

