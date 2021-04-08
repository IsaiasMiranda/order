package application;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.HourContract;

public class MainTeste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner e = new Scanner(System.in);
		/*
		//Digite o valor da hora trabalhada
		System.out.print("Enter the value of the hour worked: ");
		Double valueHour = e.nextDouble();
		
		//Digite a hora trabalhada
		System.out.print("Enter the hour worked: ");
		int hour = e.nextInt();
		e.nextLine();
		
		HourContract hourContract = new HourContract(new Date(), valueHour, hour);
		
		System.out.println(2200 + hourContract.totalValue());
*/

		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String income = e.next();
		
		int month = Integer.parseInt(income.substring(0, 2));
		int year = Integer.parseInt(income.substring(3));
		
		System.out.println(month);
		System.out.println(year);
		
	e.close();
	}
}
