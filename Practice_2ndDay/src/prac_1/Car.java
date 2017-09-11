package prac_1;

public class Car {
	String color;
	int gear;
	int speed;
	
	/*
	@Override
	public String toString()
	{
		return "Car [color = " + color + ", speed = " + speed + ", gear = " + gear + "]";
	}
	*/
	void changeGear(int g)
	{
		gear = g;
	}
	
	void speedup(int speed)
	{
		speed = speed + 10;
	}
	
	void speedDown(int speed)
	{
		speed = speed - 10;
	}

}