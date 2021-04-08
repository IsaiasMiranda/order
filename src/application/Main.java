package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import enums.WorkerLevel;

public class Main {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);

		Scanner e = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department's name: ");
		String nameDepartament = e.nextLine();

		System.out.println("Enter worker data: ");

		System.out.print("Name: ");
		String nameWorker = e.nextLine();

		System.out.print("Level: ");
		String level = e.nextLine();

		System.out.print("Base salary $: ");
		double baseSalary = e.nextDouble();

		Worker worker = new Worker(nameWorker, WorkerLevel.valueOf(level), baseSalary, new Department(nameDepartament));

		System.out.print("How many contracts to this worker? ");
		int numContract = e.nextInt();

		e.nextLine();

		for (int i = 0; i < numContract; i++) {
			System.out.println("Enter contract #" + (i + 1) + " Data: ");

			System.out.print("Date DD/MM/YYYY: ");
			Date date = sdf.parse(e.next());

			System.out.print("Value per hour: ");
			double valuePerHour = e.nextDouble();

			System.out.print("Duration (hours): ");
			int hour = e.nextInt();

			HourContract contract = new HourContract(date, valuePerHour, hour);

			worker.addContract(contract);
		}

		System.out.println();

		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String income = e.next();

		int month = Integer.parseInt(income.substring(0, 2));
		int year = Integer.parseInt(income.substring(3));

		System.out.println("Name: " + worker.getName());
		System.out.println("Departament: " + worker.getDepartament().getName());
		System.out.println("Income for: " + income + " R$: " + worker.income(year, month));

		e.close();
	}
}
