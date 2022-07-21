import entities.Employee;
import java.util.Scanner;

public class EmloyeeProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Name: ");
        employee.Name = sc.nextLine();
        System.out.println("Gross salary: ");
        employee.GrossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        employee.Tax = sc.nextDouble();

        System.out.println("Employee: " +  employee.Name + ", $ " + employee.NetSalary());

        double percentage;
        System.out.println("Witch percentage to increase salary? ");
        percentage = sc.nextDouble();
        employee.IncreaseSalary(percentage);

        System.out.println("Updated data: " +  employee.Name + ", $ " + employee.NetSalary());
        sc.close();
    }
}
