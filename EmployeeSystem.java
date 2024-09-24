import java.util.Scanner;

public class EmployeeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] employeenames = new String[5]; // array for 5 employee names
        double[][] employeesalaries = new double[5][3]; // array for salary and allowances

        for (int i = 0; i < employeenames.length; i++) { // start from 0
            System.out.println("Enter Employee Name: "); // input name and salary
            employeenames[i] = scanner.nextLine();

            System.out.print("Enter Base Salary: ");
            employeesalaries[i][0] = scanner.nextDouble();

            System.out.print("Enter Health Allowance: ");
            employeesalaries[i][1] = scanner.nextDouble();

            System.out.print("Enter Transportation Allowance: ");
            employeesalaries[i][2] = scanner.nextDouble();
            scanner.nextLine(); 
        }

        double[] employeeBonuses = new double[5];
        for (int i = 0; i < employeenames.length; i++) {
            double totalSalary = employeesalaries[i][0] + employeesalaries[i][1] + employeesalaries[i][2];
            employeeBonuses[i] = calculateBonus(totalSalary); // use total salary
        }

        System.out.println("Employee Summary: ");
        for (int i = 0; i < employeenames.length; i++) {
            System.out.println("*************************************");
            System.out.println("Name: " + employeenames[i]);
            System.out.println("Base Salary: " + employeesalaries[i][0]); // print specific base salary
            System.out.println("Total Salary: " + (employeesalaries[i][0] + employeesalaries[i][1] + employeesalaries[i][2])); // calculate total salary
            System.out.println("Bonus: " + employeeBonuses[i]); // print calculated bonus
        
        }

        scanner.close();
    }

    public static double calculateBonus(double totalSalary) { // total salary
        double bonus = 0;
        if (totalSalary > 50000) {
            bonus = 0.1 * totalSalary;
        } else if (totalSalary > 30000) {
            bonus = 0.05 * totalSalary;
        }
        return bonus; // return calculated bonus
    }
}
