package application;
import java.util.*;
import java.text.*;
import entities.*;
import enums.*;

public class Main{

	public static void main(String[] args){
		
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

		for(int i = 0; i < numContract; i++){
			System.out.println("Enter contract #" + (i + 1) + " Data: ");
			System.out.println("Date DD/MM/YYYY: ");
			//Date date = e.nex
		}
	}
}
