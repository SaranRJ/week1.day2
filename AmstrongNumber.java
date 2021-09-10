package assignment2;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int calc , reminder=0, quot=0, original = 127;
		calc = original;
		while(calc >0)
		{
			reminder = calc % 10;
			calc = calc /10;
			quot = quot +(reminder* reminder* reminder);
			
		}
		if (original == quot);
		{
			System.out.println("Armstrong Number");
			
		}
		{System.out.println("Not Armstrong Number");
		
		}
		
		}
	

}
