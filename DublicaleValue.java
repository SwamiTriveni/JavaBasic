package ExPractice;

public class DublicaleValue {

	public static void main(String[] args) 
	{
		int array[] = {12,14,15,14,12,17,15};
		int i , j;
		
		for(i=0;i<array.length;i++)
			for(j = i+1 ; j<array.length; j++)
			{
				if(array[i]== array[j])
				{
					System.out.println(array[i]);
				}
			}
	}

}
