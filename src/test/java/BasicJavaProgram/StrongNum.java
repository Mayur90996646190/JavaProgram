package BasicJavaProgram;

public class StrongNum {
	public static void main(String[] args) {
		int num = 145;
		int temp = num;
		int sum = 0;
		while(num>0){
		int n = num%10;
		int fact = 1;
		while(n>0){
		fact = fact * n--;
		}
		sum = sum + fact;
		num = num/10;
		}
		if(sum == temp){
		System.out.println("is a strong num");
		}
		else
		{
			System.out.println("is not a strong num");
		}
	}
}
