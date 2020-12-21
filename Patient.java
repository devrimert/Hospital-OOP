package Hospital;

public class Patient {

	private String PID;
	private String TC;
	private String name;
	String surname;
	MyDate bDate;
	
	public Patient(String PID, String TC, String name, String surname, MyDate date)
	{
		this.PID = PID;
		this.TC = TC;
		this.name = name;
		this.surname = surname;
		bDate = date;	//this.bDate = date;
	}
	
	public Patient()
	{
		PID = "";
		TC = "";
		name = "";
		this.surname = "";
		bDate = new MyDate(1, 1, 1900);
	}
	
	public String GetPID()
	{
		return this.PID;
	}
	
	public String GetTC()
	{
		return this.TC;
	}
	
	public String GetName()
	{
		return this.name;
	}
	
	public void SetName(String name)
	{
		this.name = name;
	}
	
	public void Display()
	{
		System.out.println("PID = " + this.PID + "\nTC = " + this.TC);
		System.out.println("Name surname = " + this.name + " " + this.surname);
		System.out.println("Birth date = " + this.bDate);
	}
	
	
	
	
	
	
	
	
}
