package Hospital;

public class MyDate {

	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year)
	{
		if(day < 1)
		{
			this.day = 1;
		}
		else if(day > 31)
		{
			this.day = 30;
		}
		else
		{
			this.day = day;
		}
		this.month = month;
		this.year = year;
	}
	
}
