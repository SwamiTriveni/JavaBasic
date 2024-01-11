package ExPractice;

public class PalandromNumber {

	public static void main(String[] args) {
		int n =181,result;
		int fact=0;
		int temp = n;
		
		while(n>0)
		{
			result = n%10;
			fact = (fact*10)+result;
			n=n/10;
		}
		
		if (temp==fact)
		{
			System.out.println("Number is palendrom number");
		}
		else
		{
			System.out.println("Number is not palendrom number");
		}

	}

}
