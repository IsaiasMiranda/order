package entities;
import enums.*;
import java.util.*;

public class Worker{
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department departament;
	private List<HourContract> contracts = new ArrayList<>();

	public Worker(){}
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Department departament)
	{
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setLevel(WorkerLevel level)
	{
		this.level = level;
	}

	public WorkerLevel getLevel()
	{
		return level;
	}

	public void setBaseSalary(Double baseSalary)
	{
		this.baseSalary = baseSalary;
	}

	public Double getBaseSalary()
	{
		return baseSalary;
	}

	public void setDepartament(Department departament)
	{
		this.departament = departament;
	}

	public Department getDepartament()
	{
		return departament;
	}

	public List<HourContract> getContracts()
	{
		return contracts;
	}

	public void addContract(HourContract contract){
		contracts.add(contract);
	}	
	
	public void removeContract(HourContract contract){
		contracts.remove(contract);
	}
}
