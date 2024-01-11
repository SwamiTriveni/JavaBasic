package ExPractice;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) 
	{
		int array[]= {1,3,4,6,2,7,8};
		int j=1,i;
		
		Arrays.sort(array);//{1,2,3,4,6,7,8}
		System.out.println(Arrays.toString(array));
		
		for(i=1;i<=array.length;i++)
	
		{
		if(i!=array[i-1])	
		{
			System.out.println(i);
			break;
		}
		
		
		}
		

	}
	
	

}
