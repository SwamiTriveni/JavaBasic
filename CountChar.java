package ExPractice;

public class CountChar {

	public static void main(String[] args) 
	{
		String s = "Testleaf";
		char ch='e';
		int count =0;
		
		char ch1[]=s.toCharArray();//{'T','e','s','t','l','e','a','f'}
		
		for(int i=0; i<ch1.length;i++)
		{
			if(ch1[i]==ch)
			{
				count++;
						
				
			}
		}
		
		System.out.println(count);
		

	}

}
