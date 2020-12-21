package Hospital;


import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		Menu();
	}
	
	public static void Menu()
	{
		Scanner scn = new Scanner(System.in);
		String name, surname, PID, TC, DID;
		int day, month, year;
		String AID, type;
		MyDate aDate;
		Patient p = new Patient();
		Doctors d = new Doctors();
		Analysis a = null;
		int selection = 0;
		
		do
		{
			System.out.println("1- Enter patient");
			System.out.println("2- Add analysis");
			System.out.println("3- Add Doctor");
			System.out.println("4- Show a specific analysis Details");
			System.out.println("5- Show all analysis details");
			System.out.print("Choose your process = ");
			selection = Integer.parseInt(scn.nextLine());
			
			switch(selection)
			{
			case 1:
				
				System.out.print("Enter PID = ");
				PID = scn.nextLine();
				System.out.print("Enter TC = ");
				TC = scn.nextLine();
				System.out.print("Enter name = ");
				name = scn.nextLine();
				System.out.print("Enter surname = ");
				surname = scn.nextLine();
				System.out.print("Enter birth day = ");
				day = Integer.parseInt(scn.nextLine());
				System.out.print("Enter birth month = ");
				month = Integer.parseInt(scn.nextLine());
				System.out.print("Enter birth year = ");
				year = Integer.parseInt(scn.nextLine());
				
				p = new Patient(PID, TC, name, surname, new MyDate(day, month, year));
				p.Display();
				
				break;
			case 2:
				System.out.print("Enter AID = ");
				AID = scn.nextLine();
				System.out.print("Enter PID = ");
				PID = scn.nextLine();
				System.out.print("Enter type = ");
				type = scn.nextLine();
				System.out.print("Enter analysis day = ");
				day = Integer.parseInt(scn.nextLine());
				System.out.print("Enter analysis month = ");
				month = Integer.parseInt(scn.nextLine());
				System.out.print("Enter analysis year = ");
				year = Integer.parseInt(scn.nextLine());
				
				a = new Analysis(AID, type, new MyDate(day, month, year), p, d);
				a.Display();
				
				break;
				
			case 3:
			System.out.print("Enter DID = ");
			DID = scn.nextLine();
			System.out.print("Enter TC = ");
			TC = scn.nextLine();
			System.out.print("Enter name = ");
			name = scn.nextLine();
			System.out.print("Enter surname = ");
			surname = scn.nextLine();
			
			d = new Doctors(DID, TC, name, surname);
			d.Display();
			
			break;
			
			case 4:
				System.out.print("Enter DID = ");
				DID = scn.nextLine();
				System.out.print("Enter TC = ");
				TC = scn.nextLine();
				d.SetTC(TC); 
				System.out.print("Enter name = ");
				name = scn.nextLine();
				System.out.print("Enter surname = ");
				surname = scn.nextLine();
				
				d = new Doctors(DID, TC, name, surname);
				d.Display();
				
				break;
				
			}
		}while(selection < 6);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
