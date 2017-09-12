package prac_1;

public class Date {
	private int year;
	private String month;
	private int day;
	
	public Date()
	{
		this(1900, "1��", 1);
	}
	public Date(int year)
	{
		this(year, "1��", 1);
	}
	public Date(int year, String month,int day)
	{
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Date [year=" + year + ", month = " + month + ", day = " + day + "]";
	}
	
	public static void main(String[] ar)
	{
		Date d = new Date();
		System.out.println(d.toString());
	}

}
