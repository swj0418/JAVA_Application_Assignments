package innerClassTest;

public class InnerClassTest {
	InnerClassTest()
	{
		Innerclass ic = new Innerclass();
	}
	
	class Innerclass
	{
		private String st = "InnerClassAttribute";
		
		Innerclass()
		{
			
		}
		
		void Print()
		{
			System.out.println("Innerclass public method");
		}
		
		void PPrint()
		{
			System.out.println("Innerclass public method");
		}
		
		public void main(String[] ar)
		{
			
		}
		
	}
	
	public static void main(String[] ar)
	{
		
	}

}
