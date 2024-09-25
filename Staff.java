import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
    
    public class Staff {
    
        public static void main(String[] args) {
            ArrayList<String> staff = new ArrayList<>();
            staff.add("Sabri");
            staff.add("Syahir");
            staff.add("Anas");
            staff.add("Mai");
    
            int[] bonuses = {1500, 900, 1200, 800};
            double[] salaries = {50000, 48000, 52000, 45000}; 
    
            LocalDateTime nowDT = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yy hh:mm:ss");
            String formattedDT = nowDT.format(formatter);
    
            for (int i = 0; i < staff.size(); i++) {
                String name = staff.get(i);
                int bonus = bonuses[i];
                double salary = salaries[i];
                printBonusMessage(name, bonus, salary, formattedDT);
            }
        }
    
        private static void printBonusMessage(String name, int bonus, double salary, String date) {
            System.out.println("Payslip Date: " + date);
            if (bonus > 1000) {
                System.out.println(name);
                System.out.println("Salary: RM " + salary );
                System.out.println("Bonus: RM" + bonus + " - Congratulations :D ");
                System.out.println("**************************************");

            } else {
                System.out.println(name);
                System.out.println("Salary: RM " + salary );
                System.out.println("Bonus: RM" + bonus + " - Try again :P" );
                System.out.println("**************************************");
            }
            System.out.println(); 
        }
    }






















































































































// import java.util.ArrayList;
// import java.util.function.Predicate;

// public class Staff {

//     public static void main(String[] args) {
//         Predicate<Double> iGTT = (bonus) -> bonus > 1000; //Predicate for checking if bonus is greater than 1000

//         // Initialize Employee2 objects
//         Employee2[] employees = new Employee2[5];
//         employees[0] = new Employee2("Farees", new double[]{5500, 500, 250});
//         employees[1] = new Employee2("Maimoon", new double[]{7500, 500, 250});
//         employees[2] = new Employee2("Sabri", new double[]{4500, 500, 250});
//         employees[3] = new Employee2("Syahir", new double[]{6500, 500, 250});
//         employees[4] = new Employee2("Khai", new double[]{3500, 500, 250});

//         // Iterate over employees and display their details
//         for (Employee2 emp : employees) {
//             System.out.println("\nStaff Name: " + emp.getName());
            
//             // Calculate bonus and check against the condition
//             double bonus = emp.calculateBonus();
//             if (iGTT.test(bonus)) {
//                 System.out.println("Bonus: RM" + bonus + " - Congratulations!");
//             } else {
//                 System.out.println("Bonus: RM" + bonus + " - Try again next year.");
//             }

//             // Display total salary
//             System.out.println("Payslip for August: RM" + emp.totalSalary());
//         }
//     }
// }

// class Employee2 {
//     private String name;
//     private double[] salary; // base Salary
//     private double hAllowance = 500; // health allowance
//     private double tAllowance = 250; // transport allowance
//     private double bonus;
//     private double totalSalary;

//     public Employee2(String name, double[] baseSalary) {
//         this.name = name;
//         this.salary = baseSalary;
//         this.bonus = 0;
//         this.totalSalary = 0;
//     }

//     public String getName() {
//         return name;
//     }

//     public double[] getSalary() {
//         return salary;
//     }

//     public double calculateBonus() {
//         double salaryTotal = totalSalary();
//         if (salaryTotal > 5000) {
//             bonus = 0.1 * salaryTotal;
//         } else if (salaryTotal > 3000) {
//             bonus = 0.05 * salaryTotal;
//         } else {
//             bonus = 0; // No bonus if salary <= 3000
//         }
//         return bonus;
//     }

//     public double totalSalary() {
//         double total = 0;
//         for (double s : salary) {
//             total += s;
//         }
//         return total + hAllowance + tAllowance + bonus;
//     }
// }
