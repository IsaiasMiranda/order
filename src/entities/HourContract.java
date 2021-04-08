package entities;

import java.util.*;

public class HourContract{
	
	public Date date;
	public Double valuePerHour;
	public Integer hours;
	
	public HourContract(){}
	
	public HourContract(Date date, Double valuePerHour, Integer hours){
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public Date getDate()
	{
		return date;
	}
	
	public Double getValuePerHour()
	{
		return valuePerHour;
	}

	public void setHours(Integer hours)
	{
		this.hours = hours;
	}

	public Integer getHours()
	{
		return hours;
	}
	
	public Double totalValue(){
		return valuePerHour * hours;
	}
}
