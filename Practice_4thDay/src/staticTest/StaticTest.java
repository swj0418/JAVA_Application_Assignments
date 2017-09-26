package staticTest;
//Method에 static 붙이면 다른데서 instance를 생성하지 않고도 그 method를 사용 할 수 있다.

public class StaticTest {
	StaticTest()
	{
		
	}
	
	void Print()
	{
		System.out.println("Static Test!");
	}
	
	static void PPrint()
	{
		System.out.println("Static Test!");
	}

}
