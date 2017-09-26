package inheritanceTest;

public class Employee {
	public String name;
	String address;
	protected int salary;
	private int rrn;
	
	public Employee(String name, String address, int salary, int rrn)
	{
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.rrn = rrn;
	}
	
	@Override
	public String toString()
	{
		return "Game Item [name = " + name + "|| address = " + address + "|| salary = " 
	+ salary + "|| rrn = " + rrn + "]";
	}

}
