package prac_2;

import java.util.Scanner;

public class StringTest_2 {
	public static void main(String[] ar)
	{
		String str;
		Scanner in = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Input String");
			str = in.nextLine();
			
			if(str.equals("quit") == true)
			{
				break;
			}
			
			else if(str.matches("^www\\.(.+)")) { // General Expression
				System.out.println(str + "은 'www' 로 시작합니다");
			}
			else if(str.matches("^www.(.+)")){
				System.out.println(str + "은 'www' 로 시작합니다");
			}
			else
			{
				System.out.println(str + "은 'www' 로 시작하지 않아요");
			}
			
		}
		
	}

}
