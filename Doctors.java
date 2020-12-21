package Hospital;

public class Doctors {

		private String DID;
		private String TC;
		private String name;
		String surname;
		
		
		public Doctors(String DID, String TC, String name, String surname)
		{
			this.DID = DID;
			this.TC = TC;
			this.name = name;
			this.surname = surname;
		
		}
		
		public Doctors()
		{
			DID = "";
			TC = "";
			name = "";
			this.surname = "";
		
		}
		
		public String GetDID()
		{
			return this.DID;
		}
		
		public String GetTC()
		{
			return this.TC;
		}
		
		public void SetTC(String TC)
		{
			this.TC = TC;
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
			System.out.println("DID = " + this.DID + "\nTC = " + this.TC);
			System.out.println("Name surname = " + this.name + " " + this.surname);
		
		}
		
		
		
		
		
		
		
		
	}