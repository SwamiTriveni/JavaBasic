package ExPractice;

public class Car {
	
	public void applyBreak()
	{
		System.out.println("Applied Break");
	}
	
	public void soundHorn()
	{
		System.out.println("Sound Horn");
	}

	
	public static void main(String[] args) 
	{
		Car obj=new Car();
		obj.applyBreak();
		obj.soundHorn();
		
	}
}
