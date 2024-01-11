package ExPractice;

public class DuplicateAbsNumber {
	
int i, j;
	
	public boolean dublicteAbsNumber(int num[], int k)
	{
		for(i=0;i<=num.length;i++)
		{
			for(j = i+1 ; j<num.length; j++)
			{
				if(num[i]== num[j]&& Math.abs(i-j)<=k)
				{
					return true;
				}
			}
				
			}
		return false;
	}

	public static void main(String[] args) 
	{
		DuplicateAbsNumber obj = new DuplicateAbsNumber();
		
		int num[]= {1,2,3,1};
		int k=3 ;
		
		if(obj.dublicteAbsNumber(num, k))
		{
			
			System.out.println("two distinct indices "+obj.i+" & "+obj.j);
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
			System.out.println("No distinct indices");
		}

	}

}
