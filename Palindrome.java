package assignment2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 454;
		int temp = num;
		int r , sum = 0;
		while (num>0) {
			r = num%10;
			num=num/10;
			sum=(sum*10)+r;
		
		}
		if (temp==sum)
			System.out.println("The Palindrome of a given Number is " + sum);
		else {
			System.out.println("The Number is Not Palindrome "+ sum);
			
		}
	}

}
