package prac_1;


public class carTest {
	public static void main(String[] ar)
	{
		Car myCar = new Car();
		
		myCar.changeGear(2);
		myCar.speedup(50);
		myCar.speedDown(60);
		
		System.out.println(myCar);
		
		System.out.println(myCar.gear + " ");
	}

}
