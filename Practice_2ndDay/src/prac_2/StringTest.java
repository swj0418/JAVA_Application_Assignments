package prac_2;

public class StringTest {
	public static void main(String[] ar)
	{
		String proverb = "A barking dog";
		String s1, s2, s3, s4;
		
		System.out.println("Length ==" + proverb.length());
		
		s1 = proverb.concat(" never Bites!    ");
		s2 = s1.replace('B', 'b');
		s3 = proverb.substring(2, 5);
		s4 = proverb.toUpperCase();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		String s5, s6;
		
		s5 = proverb.trim();
		s6 = proverb.intern();
		
		System.out.println(s1.length());
		System.out.println(s5);
		System.out.println(s5.length());
		System.out.println(s6);
		
	}

}
