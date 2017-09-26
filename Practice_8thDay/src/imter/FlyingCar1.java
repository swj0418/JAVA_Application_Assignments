package imter;
interface Drivable {
	void drive();
}
interface Flyable{
	void fly();
}
public class FlyingCar1 implements Drivable, Flyable{
	public void drive()
	{
		System.out.println("Drivin'");
	}
	public void fly()
	{
		System.out.println("Flyin'");
	}
	public static void main(String[] ar)
	{
		FlyingCar1 obj = new FlyingCar1();
		obj.drive();
		obj.fly();
	}
}
