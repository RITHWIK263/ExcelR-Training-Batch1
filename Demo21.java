import java.util.Scanner;

public class Demo22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter monthly gross salary: ");
        double monthlySalary = scanner.nextDouble();

        System.out.print("Enter HRA (House Rent Allowance): ");
        double hra = scanner.nextDouble();

        System.out.print("Enter PF (Provident Fund): ");
        double pf = scanner.nextDouble();
        double annualSalary = monthlySalary * 12;
        double deductions = hra + pf;
        double taxableIncome = annualSalary - deductions;
        double tax = 0.0;
        if (taxableIncome <= 500000) {
            tax = taxableIncome * 0.10;
        } else if (taxableIncome > 500000 && taxableIncome <= 1000000) {
            tax = 500000 * 0.10 + (taxableIncome - 500000) * 0.20;
        } else {
            tax = 500000 * 0.10 + 500000 * 0.20 + (taxableIncome - 1000000) * 0.30; 
        }
        System.out.println("Annual Salary: Rs " + annualSalary);
        System.out.println("Deductions (HRA + PF): Rs " + deductions);
        System.out.println("Taxable Income: Rs " + taxableIncome);
        System.out.println("Total Income Tax: Rs " + tax);
    }
}
