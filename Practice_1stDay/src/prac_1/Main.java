package prac_1;



class Television
{
	int channel; int volume; boolean onOff;
	
	String TVName;
	
	Television(String TVName, int channel, int volume, boolean onOff)
	{
		this.TVName = TVName;
		this.channel = channel;
		this.volume = volume;
		this.onOff = onOff;
	}
	
	Television()
	{
		
	}
	
	void print()
	{
		System.out.println("TV Name : " + this.TVName + "\n" + "Channel : " + this.channel + "\n" + "Volume : " +
				this.volume + "\n" + "onOff : " + this.onOff);
	}
}

public class Main {
	
	public static void main(String[] ar)
	{
		Television TV = new Television();
		
		TV.channel = 7;
		TV.volume = 9;
		TV.onOff = true;
		
		System.out.println("Channel : " + TV.channel + "\n" + "Volume : " + TV.volume + "\n" + "onOff : " + TV.onOff);
		
		System.out.println("=================================");
		Television TV_2 = new Television("TV 2", 10, 30, true);
		System.out.println("TV Name : " + TV_2.TVName + "\n" + "Channel : " + TV_2.channel + "\n" + "Volume : " +
		TV_2.volume + "\n" + "onOff : " + TV_2.onOff);
		
		System.out.println("=================================");
		Television TV_3 = new Television("TV 3", 0, 0, false);
		TV_3.print();
	}

}
