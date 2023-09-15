package aplication;

import java.util.Locale;
import java.util.Scanner;
import Entities.Employee;

public class Progam {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			Employee emp = new Employee();
			
			System.out.print("Name: ");
			emp.name = sc.nextLine();
			
			System.out.print("Gross salary: ");
			emp.salary = sc.nextDouble();
			
			System.out.print("Tax: ");
			emp.tax = sc.nextDouble();
			
			System.out.println();
			System.out.println("Employee: " + emp);
			
			System.out.println();
			System.out.print("Wich porcentage to increase salary? ");
			double porcentage = sc.nextDouble();
			emp.increaseSalary(porcentage);
			
			System.out.println();
			System.out.println("Update data: " + emp);
			
			
			
			
			sc.close();
	}

}
