package BasicJavaProgram;

public class PalindromeNum {
	public static void main(String[] args) {
		int num = 123454321;
		int a = num;
		int temp = 0;
		while(num>0){
		int rem = num%10;
		temp = temp*10+rem;
		num =num/10;
		}
		if(a==temp)
		{
		System.out.println("Given num is a Palindrome");
		}
		else {
			System.out.println("Is not a palindrome");
		}
	}
}
