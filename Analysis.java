package Hospital;

public class Analysis {

	private String AID;
	String type;
	MyDate aDate;
	private Patient p;
	private Doctors d;
	
	public Analysis(String AID, String type, MyDate aDate, Patient p, Doctors d)
	{
		this.AID = AID;
		this.type = type;
		this.aDate = aDate;
		this.p = p;
		this.d = d;
	}
	
	public Analysis(String AID, String type, MyDate aDate, String name, String surname)
	{
		this.AID = AID;
		this.type = type;
		this.aDate = aDate;
		p = new Patient("555", "45678998778", name, surname, new MyDate(26, 05, 1992));
	}
	
	public Patient GetPatient()
	{
		return this.p;
	}
	
	public Doctors GetDoctors()
	{
		return this.d;
	}
	
	public String GetAID()
	{
		return this.AID;
	}
	
	public void Display()
	{
		System.out.println("AID = " + this.AID );
		System.out.println("Patient name = " + p.GetName() + " " + p.surname);
		System.out.println("Doctor name =" + d.GetName() + " " + d.surname);
		System.out.println("Analysis type = " + this.type);
		System.out.println("Analysis date = " + this.aDate);
		
	}
	
	
	
}
