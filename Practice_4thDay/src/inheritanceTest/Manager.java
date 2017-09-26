package inheritanceTest;

public class Manager extends Employee{
	private int bonus;
	
	public Manager(String name, String address, int salary, int rrn, int bonus)
	{
		super(name, address, salary, rrn);
		this.bonus = bonus;
	}
	
	void test()
	{
		System.out.println("name	" + name);
		System.out.println("address	" + address);
		//System.out.println("rrn		" + rrn);
	}
	
	public static void main(String[] ar0)
	{
		new Manager("DongGu", "Sadang", 100, 10923859, 20).test();
	}
}
